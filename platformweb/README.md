# platformweb

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).



前端环境安装：
步骤：
1、先安装node.js  https://nodejs.org/en/download/
windows直接下载，傻瓜式安装即可
mac : brew install nodejs  安装最新版 brew upgrade node，也可以下载安装包进行安装
验证：node -v
2、安装淘宝镜像  npm install -g cnpm --registry=https://registry.npm.taobao.org
目的是国内镜像快，以后安装命令由npm变成cnpm，如果安装失败了多运行几次就好
验证 cnpm -v
3、安装webpack:  cnpm install webpack -g
验证 : webpack -v
安装webpack时，有可能运行不了webpack -v 那么安装cnpm install webpack-cli -g
运行webpack -v报错Unexpected end of JSON input while parsing near '....js":"^2.1.6","obuf":' 
安装cnpm install -g npm-install-peers


4、安装vue-cli  ： cnpm install vue-cli -g
验证： vue -V

5、初始化项目 vue init webpack 项目名称   一路回车即可，测试相关的可以不装

vue init webpack 项目名称，最后报错
 初始化webpack项目报Unexpected end of JSON input while parsing near '....js":"^2.1.6","obuf":'
解决办法
cd 到项目目录下
清除缓存npm cache clean --force
cnpm install

最后安装的插件：
cnpm install echarts -S
cnpm install --save vue-axios
cnpm install element-ui -S
cnpm install --save axios
cnpm install --save js-file-download

6、启动运行：
cd 到项目目录下
npm run dev
浏览器访问：http://localhost:8080/