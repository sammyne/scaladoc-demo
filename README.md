# scaladoc-demo

## 快速开始

```bash
sbt doc
```

生成的文档参见 target/scala-2.12/api 文件夹。

本项目已配置 github actions，使得每次往 main 或 dev 分支的提交都会触发更新 HTML 格式的 scaladoc 文档，并发布至这个地址的
[github pages](https://sammyne.github.io/scaladoc-demo/)。

## 温馨提示
- scala 3 开始支持 markdown 格式的文档注释，详情参见
  [New features for scaladoc](https://docs.scala-lang.org/scala3/scaladoc.html)。

## 参考文献
- [Scala-lang scaladoc style guide](https://docs.scala-lang.org/style/scaladoc.html)
- [Scaladoc for Library Authors](https://docs.scala-lang.org/overviews/scaladoc/for-library-authors.html)
