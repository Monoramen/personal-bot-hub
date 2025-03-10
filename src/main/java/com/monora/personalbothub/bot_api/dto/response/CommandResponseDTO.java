package com.monora.personalbothub.bot_api.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import java.util.Set;


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record CommandResponseDTO(
        @Nullable
        @JsonProperty("id")
        Long id,
        @NotNull
        @JsonProperty("command")
        String command,
        @JsonProperty("response")
        String response,
        @Nullable
        @JsonProperty("attachment_ids")
        Set<Long> attachmentIds // Добавляем сюда ID
        //Set<AttachmentResponseDTO> attachments // Сюда маппим вложения в DTO
) {
}
