package com.google.api.client.googleapis.notifications.json;

import com.google.api.client.googleapis.notifications.TypedNotificationCallback;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JsonNotificationCallback<T> extends TypedNotificationCallback<T> {
    private static final long serialVersionUID = 1;

    public abstract JsonFactory getJsonFactory() throws IOException;

    @Override // com.google.api.client.googleapis.notifications.TypedNotificationCallback
    public final JsonObjectParser getObjectParser() throws IOException {
        return new JsonObjectParser(getJsonFactory());
    }
}
