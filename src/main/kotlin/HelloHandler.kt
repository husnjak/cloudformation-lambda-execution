import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestStreamHandler
import java.io.InputStream
import java.io.OutputStream

class HelloHandler: RequestStreamHandler {
    override fun handleRequest(input: InputStream?, output: OutputStream?, context: Context?) {
        context?.logger?.log("Hello world")
        val result = ("{"
                + "\"statusCode\":\"200\","
                + "\"body\":\"Fuck You!\","
                + "\"headers\":{}"
                + "}")
        output?.write(result.toByteArray())
    }
}