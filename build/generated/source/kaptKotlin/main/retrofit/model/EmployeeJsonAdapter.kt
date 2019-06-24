// Code generated by moshi-kotlin-codegen. Do not edit.
package retrofit.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import java.lang.NullPointerException
import kotlin.Boolean
import kotlin.Int
import kotlin.String

class EmployeeJsonAdapter(moshi: Moshi) : JsonAdapter<Employee>() {
    private val options: JsonReader.Options =
            JsonReader.Options.of("id", "employee_name", "employee_salary", "employee_age", "profile_image")

    private val intAdapter: JsonAdapter<Int> =
            moshi.adapter<Int>(Int::class.java, kotlin.collections.emptySet(), "id")

    private val stringAdapter: JsonAdapter<String> =
            moshi.adapter<String>(String::class.java, kotlin.collections.emptySet(), "employee_name")

    private val nullableStringAdapter: JsonAdapter<String?> =
            moshi.adapter<String?>(String::class.java, kotlin.collections.emptySet(), "profile_image")

    override fun toString(): String = "GeneratedJsonAdapter(Employee)"

    override fun fromJson(reader: JsonReader): Employee {
        var id: Int? = null
        var employee_name: String? = null
        var employee_salary: String? = null
        var employee_age: Int? = null
        var profile_image: String? = null
        var profile_imageSet: Boolean = false
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 -> id = intAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'id' was null at ${reader.path}")
                1 -> employee_name = stringAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'employee_name' was null at ${reader.path}")
                2 -> employee_salary = stringAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'employee_salary' was null at ${reader.path}")
                3 -> employee_age = intAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'employee_age' was null at ${reader.path}")
                4 ->  {
                    profile_image = nullableStringAdapter.fromJson(reader)
                    profile_imageSet = true
                }
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = Employee(
                id = id ?: throw JsonDataException("Required property 'id' missing at ${reader.path}"),
                employee_name = employee_name ?: throw JsonDataException("Required property 'employee_name' missing at ${reader.path}"),
                employee_salary = employee_salary ?: throw JsonDataException("Required property 'employee_salary' missing at ${reader.path}"),
                employee_age = employee_age ?: throw JsonDataException("Required property 'employee_age' missing at ${reader.path}"))
        result = result.copy(
                profile_image = if (profile_imageSet) profile_image else result.profile_image)
        return result
    }

    override fun toJson(writer: JsonWriter, value: Employee?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("id")
        intAdapter.toJson(writer, value.id)
        writer.name("employee_name")
        stringAdapter.toJson(writer, value.employee_name)
        writer.name("employee_salary")
        stringAdapter.toJson(writer, value.employee_salary)
        writer.name("employee_age")
        intAdapter.toJson(writer, value.employee_age)
        writer.name("profile_image")
        nullableStringAdapter.toJson(writer, value.profile_image)
        writer.endObject()
    }
}
