package com.microsoft.identity.common.java.authorities;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.C22239OooO0oo;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.CommonURIBuilder;
import java.lang.reflect.Type;
import java.net.URI;

/* JADX INFO: loaded from: classes9.dex */
public class AuthorityDeserializer implements JsonDeserializer<Authority> {
    private static final String TAG = "AuthorityDeserializer";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Authority deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String str;
        boolean z = true;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = asJsonObject.get(C18437z2.f56754h);
        if (jsonElement2 == null) {
            return null;
        }
        String asString = jsonElement2.getAsString();
        asString.getClass();
        switch (asString) {
            case "AAD":
                C22239OooO0oo.OooO0O0(new StringBuilder(), TAG, ":deserialize", "Type: AAD");
                AzureActiveDirectoryAuthority azureActiveDirectoryAuthority = (AzureActiveDirectoryAuthority) jsonDeserializationContext.deserialize(asJsonObject, AzureActiveDirectoryAuthority.class);
                if (azureActiveDirectoryAuthority != null && (str = azureActiveDirectoryAuthority.mAuthorityUrlString) != null) {
                    try {
                        CommonURIBuilder commonURIBuilder = new CommonURIBuilder(URI.create(str));
                        String str2 = commonURIBuilder.getScheme() + "://" + commonURIBuilder.getHost();
                        String lastPathSegment = commonURIBuilder.getLastPathSegment();
                        if (lastPathSegment != null && lastPathSegment.length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            azureActiveDirectoryAuthority.mAudience = AzureActiveDirectoryAudience.getAzureActiveDirectoryAudience(str2, lastPathSegment);
                            return azureActiveDirectoryAuthority;
                        }
                    } catch (IllegalArgumentException e) {
                        Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, ":deserialize"), e.getMessage(), e);
                    }
                }
                return azureActiveDirectoryAuthority;
            case "B2C":
                C22239OooO0oo.OooO0O0(new StringBuilder(), TAG, ":deserialize", "Type: B2C");
                return (Authority) jsonDeserializationContext.deserialize(asJsonObject, AzureActiveDirectoryB2CAuthority.class);
            case "ADFS":
                C22239OooO0oo.OooO0O0(new StringBuilder(), TAG, ":deserialize", "Type: ADFS");
                return (Authority) jsonDeserializationContext.deserialize(asJsonObject, ActiveDirectoryFederationServicesAuthority.class);
            case "CIAM":
                C22239OooO0oo.OooO0O0(new StringBuilder(), TAG, ":deserialize", "Type: CIAM");
                return (Authority) jsonDeserializationContext.deserialize(asJsonObject, CIAMAuthority.class);
            default:
                C22239OooO0oo.OooO0O0(new StringBuilder(), TAG, ":deserialize", "Type: Unknown");
                return (Authority) jsonDeserializationContext.deserialize(asJsonObject, UnknownAuthority.class);
        }
    }
}
