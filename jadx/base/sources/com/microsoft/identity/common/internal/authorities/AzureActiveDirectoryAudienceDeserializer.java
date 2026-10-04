package com.microsoft.identity.common.internal.authorities;

import androidx.concurrent.futures.OooO00o;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.authorities.AccountsInOneOrganization;
import com.microsoft.identity.common.java.authorities.AllAccounts;
import com.microsoft.identity.common.java.authorities.AnyOrganizationalAccount;
import com.microsoft.identity.common.java.authorities.AnyPersonalAccount;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAudience;
import com.microsoft.identity.common.logging.Logger;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public class AzureActiveDirectoryAudienceDeserializer implements JsonDeserializer<AzureActiveDirectoryAudience> {
    private static final String TAG = "AzureActiveDirectoryAudienceDeserializer";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public AzureActiveDirectoryAudience deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":deserialize");
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = asJsonObject.get(C18437z2.f56754h);
        if (jsonElement2 == null) {
            return null;
        }
        String asString = jsonElement2.getAsString();
        asString.getClass();
        switch (asString) {
            case "PersonalMicrosoftAccount":
                Logger.verbose(strOooO0OO, "Type: PersonalMicrosoftAccount");
                return (AzureActiveDirectoryAudience) jsonDeserializationContext.deserialize(asJsonObject, AnyPersonalAccount.class);
            case "AzureADMultipleOrgs":
                Logger.verbose(strOooO0OO, "Type: AzureADMultipleOrgs");
                return (AzureActiveDirectoryAudience) jsonDeserializationContext.deserialize(asJsonObject, AnyOrganizationalAccount.class);
            case "AzureADMyOrg":
                Logger.verbose(strOooO0OO, "Type: AzureADMyOrg");
                return (AzureActiveDirectoryAudience) jsonDeserializationContext.deserialize(asJsonObject, AccountsInOneOrganization.class);
            case "AzureADandPersonalMicrosoftAccount":
                Logger.verbose(strOooO0OO, "Type: AzureADandPersonalMicrosoftAccount");
                return (AzureActiveDirectoryAudience) jsonDeserializationContext.deserialize(asJsonObject, AllAccounts.class);
            default:
                Logger.verbose(strOooO0OO, "Type: Unknown");
                return (AzureActiveDirectoryAudience) jsonDeserializationContext.deserialize(asJsonObject, UnknownAudience.class);
        }
    }
}
