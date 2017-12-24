# zylLogging
封装logger以及请求用的LoggerInterceptor

### 1、在自己项目中添加本项目依赖：

    compile 'com.github.zylRookie:zylLogging:1.0.1'

### 2、在根目录中添加：

    allprojects {
        repositories {
           ...
          maven {
              url "https://jitpack.io"
          }
       }
    }
  
 ### 3、在项目中使用：
  在application初始化
  
    override fun onCreate() {
        super.onCreate()
        ZLogger.init(true)
      }
  
     ZLogger.e("测试")
   
     ZLogger.e("TAG", "测试 " + e.message)
    
 ### 4、在OKhttp请求封装时候使用：
 
    .addInterceptor(LoggingInterceptor
                        .Builder()//构建者模式
                        .loggable(true) //是否开启日志打印
                        .setLevel(Level.BODY) //打印的等级
                        .log(Platform.INFO) // 打印类型
                        .request("zylLog") // request的Tag
                        .response("zylLog")// Response的Tag
                        .addHeader("version", BuildConfig.VERSION_NAME)//打印版本
                        .build()
                )
     .build()
     
     
