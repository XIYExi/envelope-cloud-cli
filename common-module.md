# common-module 通用模块

## core 核心包


### @Xss脚本检测注解

直接通过注解自动检测xss脚本，```@Xss```注解为运行时注解，可以挂载在：

- Method 方法
- Constructor 构造函数
- Field 字段、枚举的常量
- Parameter 方法参数

在 ```xss\XssValidator``` 会对注解挂载对象的数据进行正则比对，如果为脚本或者代码那么执行完```isvalid```方法后抛异常.



### @Sensitive 数据脱敏

部分数据存在敏感内容，如身份证，银行卡，邮箱等，采用数据脱敏对特定的内容进行处理保护用户数据 

cli使用jackson序列化策略对标注了```@Sensitive```注解的```字段、枚举的常量```进行脱敏，
可以在```SensitiveStrategy```内自定义脱敏策略。

系统根据```service\SensitiveService```中```isSensitive()```返回的值进行判断是否脱敏，
使用脱敏注解的时候请在自己的业务逻辑层实现```SensitiveService```接口并重写```isSensitive```函数来判断何时进行脱敏.

重写例子如下(管理员则不脱敏)：

```java
@Service
class MySensitiveStrategy implements SensitiveStrategy{
    
    @Override
    public boolean isSensitive(){
        return !LoginHelper.isAdmin();
    }
}
```



