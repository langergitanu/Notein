package com.microsoft.identity.client.claims;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.huawei.hms.network.embedded.C18437z2;
import java.lang.reflect.Type;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class RequestClaimAdditionalInformationSerializer implements JsonSerializer<RequestedClaimAdditionalInformation> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(RequestedClaimAdditionalInformation requestedClaimAdditionalInformation, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("essential", requestedClaimAdditionalInformation.getEssential());
        if (requestedClaimAdditionalInformation.getValue() != null) {
            jsonObject.addProperty("value", requestedClaimAdditionalInformation.getValue().toString());
        }
        if (requestedClaimAdditionalInformation.getValues().size() > 0) {
            JsonArray jsonArray = new JsonArray();
            Iterator<Object> it = requestedClaimAdditionalInformation.getValues().iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next().toString());
            }
            jsonObject.add(C18437z2.f56756j, jsonArray);
        }
        return jsonObject;
    }
}
