package bomber.converter.dto.schema

import bomber.dto.schema.RestSchemaDTO
import bomber.model.schema.RestSchema
import org.springframework.core.convert.converter.Converter

object RestSchemaDTOConverter : Converter<RestSchema, RestSchemaDTO> {
    override fun convert(source: RestSchema): RestSchemaDTO {
        return RestSchemaDTO(
            id = source.id,
            pathVariables = source.pathVariables,
            headers = source.headers,
            requestParams = source.requestParams.map { RequestParamDTOConverter.convert(it) },
            body = source.body
        )
    }
}