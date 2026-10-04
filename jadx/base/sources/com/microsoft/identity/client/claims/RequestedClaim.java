package com.microsoft.identity.client.claims;

/* JADX INFO: loaded from: classes9.dex */
public class RequestedClaim {
    private RequestedClaimAdditionalInformation mInformation;
    private String mName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestedClaim)) {
            return false;
        }
        RequestedClaim requestedClaim = (RequestedClaim) obj;
        if (!this.mName.equals(requestedClaim.mName)) {
            return false;
        }
        RequestedClaimAdditionalInformation requestedClaimAdditionalInformation = this.mInformation;
        RequestedClaimAdditionalInformation requestedClaimAdditionalInformation2 = requestedClaim.mInformation;
        return requestedClaimAdditionalInformation != null ? requestedClaimAdditionalInformation.equals(requestedClaimAdditionalInformation2) : requestedClaimAdditionalInformation2 == null;
    }

    public RequestedClaimAdditionalInformation getAdditionalInformation() {
        return this.mInformation;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        int iHashCode = this.mName.hashCode() * 31;
        RequestedClaimAdditionalInformation requestedClaimAdditionalInformation = this.mInformation;
        return iHashCode + (requestedClaimAdditionalInformation != null ? requestedClaimAdditionalInformation.hashCode() : 0);
    }

    public void setAdditionalInformation(RequestedClaimAdditionalInformation requestedClaimAdditionalInformation) {
        this.mInformation = requestedClaimAdditionalInformation;
    }

    public void setName(String str) {
        this.mName = str;
    }
}
