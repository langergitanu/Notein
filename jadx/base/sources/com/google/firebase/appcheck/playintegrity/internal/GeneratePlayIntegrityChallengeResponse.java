package com.google.firebase.appcheck.playintegrity.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class GeneratePlayIntegrityChallengeResponse {
    static final String CHALLENGE_KEY = "challenge";
    static final String TIME_TO_LIVE_KEY = "ttl";
    private String challenge;
    private String timeToLive;

    private GeneratePlayIntegrityChallengeResponse(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        this.challenge = str;
        this.timeToLive = str2;
    }

    public static GeneratePlayIntegrityChallengeResponse fromJsonString(String str) throws FirebaseException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strEmptyToNull = Strings.emptyToNull(jSONObject.optString("challenge"));
        String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (strEmptyToNull == null || strEmptyToNull2 == null) {
            throw new FirebaseException("Unexpected server response.");
        }
        return new GeneratePlayIntegrityChallengeResponse(strEmptyToNull, strEmptyToNull2);
    }

    public String getChallenge() {
        return this.challenge;
    }

    public String getTimeToLive() {
        return this.timeToLive;
    }
}
