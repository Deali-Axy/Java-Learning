目前方法引用共有以下四种形式：

| 类型 | 示例 | 代码 | 对应的Lambda表达式 |
| ---- | ---- | --- | ------------------ |
| 引用静态方法 | `ContainingClass::staticMethodName` | `String::valueOf` | `(s) -> String.valueOf(s)`
| 引用某个对象的实例方法 | `containingObject::instanceMethodName` | `x::toString()` | `() -> this.toString()`
| 引用某个类型的任意对象的实例方法 | `ContainingType::methodName` | `String::toString` | `(s) -> s.toString`
| 引用构造方法 | `ClassName::new` | `String::new` | `() -> new String()`