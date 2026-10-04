package com.orion.notein.domain.models.cloudsync;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOo000.OooO00o;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m80612d2 = {"computeMetaHash", "", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "app_google_playRelease"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CloudMetaExtraKt {
    public static final String computeMetaHash(CloudMetaExtra cloudMetaExtra) throws NoSuchAlgorithmException {
        OooOOO0.OooO0oO(cloudMetaExtra, "<this>");
        StringBuilder sb = new StringBuilder();
        String title = cloudMetaExtra.getTitle();
        if (title == null) {
            title = "";
        }
        sb.append(title);
        sb.append("|");
        String strResolvedParentId = cloudMetaExtra.resolvedParentId(null);
        if (strResolvedParentId == null) {
            strResolvedParentId = "";
        }
        sb.append(strResolvedParentId);
        sb.append("|");
        Boolean favorite = cloudMetaExtra.getFavorite();
        sb.append(favorite != null ? favorite.booleanValue() : false);
        sb.append("|");
        Boolean inTrashBin = cloudMetaExtra.getInTrashBin();
        sb.append(inTrashBin != null ? inTrashBin.booleanValue() : false);
        sb.append("|");
        Integer sortKey = cloudMetaExtra.getSortKey();
        sb.append(sortKey != null ? sortKey.intValue() : 0);
        sb.append("|");
        Boolean lockAdded = cloudMetaExtra.getLockAdded();
        sb.append(lockAdded != null ? lockAdded.booleanValue() : false);
        String string = sb.toString();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = string.getBytes(C33580OooO00o.f121231OooO0O0);
        OooOOO0.OooO0o(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        OooOOO0.OooO0o(bArrDigest, "digest(...)");
        return OooOOO.Oooo00o(bArrDigest, "", new OooO00o(), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence computeMetaHash$lambda$1(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }
}
