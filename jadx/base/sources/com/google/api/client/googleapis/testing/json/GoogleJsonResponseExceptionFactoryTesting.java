package com.google.api.client.googleapis.testing.json;

import com.aspose.slides.C22212OooOoO0;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class GoogleJsonResponseExceptionFactoryTesting {
    public static GoogleJsonResponseException newMock(JsonFactory jsonFactory, int i, String str) throws IOException {
        HttpRequest httpRequestBuildGetRequest = new MockHttpTransport.Builder().setLowLevelHttpResponse(new MockLowLevelHttpResponse().setStatusCode(i).setReasonPhrase(str).setContentType("application/json; charset=UTF-8").setContent(C22212OooOoO0.OooO0OO(i, "{ \"error\": { \"errors\": [ { \"reason\": \"", str, "\" } ], \"code\": ", " } }"))).build().createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
        httpRequestBuildGetRequest.setThrowExceptionOnExecuteError(false);
        return GoogleJsonResponseException.from(jsonFactory, httpRequestBuildGetRequest.execute());
    }
}
