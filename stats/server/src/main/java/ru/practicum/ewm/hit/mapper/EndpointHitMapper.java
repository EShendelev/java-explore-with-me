package ru.practicum.ewm.hit.mapper;

import lombok.experimental.UtilityClass;
import ru.practicum.ewm.request.AddEndpointHitRequestDto;
import ru.practicum.ewm.response.EndpointHitResponseDto;
import ru.practicum.ewm.hit.model.EndpointHit;

@UtilityClass
public final class EndpointHitMapper {

    public static EndpointHit toEndpointHit(AddEndpointHitRequestDto endpointHitDto) {
        EndpointHit endpointHit = new EndpointHit();

        endpointHit.setApp(endpointHitDto.getApp());
        endpointHit.setUri(endpointHitDto.getUri());
        endpointHit.setIp(endpointHitDto.getIp());
        endpointHit.setTimestamp(endpointHitDto.getTimestamp());

        return endpointHit;
    }

    public static EndpointHitResponseDto toEndpointHitResponseDto(EndpointHit endpointHit) {
        EndpointHitResponseDto responseDto = new EndpointHitResponseDto();

        responseDto.setId(endpointHit.getId());
        responseDto.setApp(endpointHit.getApp());
        responseDto.setUri(endpointHit.getUri());
        responseDto.setIp(endpointHit.getIp());
        responseDto.setTimestamp(endpointHit.getTimestamp());

        return responseDto;
    }
}
