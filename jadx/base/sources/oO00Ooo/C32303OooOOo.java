package oO00Ooo;

import Oooo0.o0OoOo0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: oO00Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32303OooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C32303OooOOo f116207OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final List<C32303OooOOo> f116208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32303OooOOo f116209OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32303OooOOo f116210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C32303OooOOo f116211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C32303OooOOo f116212OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C32303OooOOo f116213OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C32303OooOOo f116214OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C32303OooOOo f116215OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f116216OooO00o;

    static {
        TreeMap treeMap = new TreeMap();
        for (int i : o0OoOo0.OooO0O0(17)) {
            C32303OooOOo c32303OooOOo = (C32303OooOOo) treeMap.put(Integer.valueOf(o0OoOo0.OooO00o(i)), new C32303OooOOo(i));
            if (c32303OooOOo != null) {
                throw new IllegalStateException("Code value duplication between " + OooOOOo.OooOOO0.OooO0o0(c32303OooOOo.f116216OooO00o) + " & " + OooOOOo.OooOOO0.OooO0o0(i));
            }
        }
        f116208OooO0O0 = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f116209OooO0OO = OooOOOo.OooOOO0.OooO00o(1);
        OooOOOo.OooOOO0.OooO00o(2);
        f116210OooO0Oo = OooOOOo.OooOOO0.OooO00o(3);
        f116212OooO0o0 = OooOOOo.OooOOO0.OooO00o(4);
        OooOOOo.OooOOO0.OooO00o(5);
        f116211OooO0o = OooOOOo.OooOOO0.OooO00o(6);
        OooOOOo.OooOOO0.OooO00o(7);
        f116213OooO0oO = OooOOOo.OooOOO0.OooO00o(8);
        f116214OooO0oo = OooOOOo.OooOOO0.OooO00o(17);
        OooOOOo.OooOOO0.OooO00o(9);
        f116207OooO = OooOOOo.OooOOO0.OooO00o(10);
        OooOOOo.OooOOO0.OooO00o(11);
        OooOOOo.OooOOO0.OooO00o(12);
        OooOOOo.OooOOO0.OooO00o(13);
        OooOOOo.OooOOO0.OooO00o(14);
        f116215OooOO0 = OooOOOo.OooOOO0.OooO00o(15);
        OooOOOo.OooOOO0.OooO00o(16);
    }

    public C32303OooOOo(int i) {
        if (i == 0) {
            throw new NullPointerException(String.valueOf("canonicalCode"));
        }
        this.f116216OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32303OooOOo) {
            return this.f116216OooO00o == ((C32303OooOOo) obj).f116216OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f116216OooO00o;
        return Arrays.hashCode(new Object[]{i == 0 ? null : Integer.valueOf(i - 1), null});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Status{canonicalCode=");
        switch (this.f116216OooO00o) {
            case 1:
                str = "OK";
                break;
            case 2:
                str = "CANCELLED";
                break;
            case 3:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
            case 4:
                str = "INVALID_ARGUMENT";
                break;
            case 5:
                str = "DEADLINE_EXCEEDED";
                break;
            case 6:
                str = "NOT_FOUND";
                break;
            case 7:
                str = "ALREADY_EXISTS";
                break;
            case 8:
                str = "PERMISSION_DENIED";
                break;
            case 9:
                str = "RESOURCE_EXHAUSTED";
                break;
            case 10:
                str = "FAILED_PRECONDITION";
                break;
            case 11:
                str = "ABORTED";
                break;
            case 12:
                str = "OUT_OF_RANGE";
                break;
            case 13:
                str = "UNIMPLEMENTED";
                break;
            case 14:
                str = "INTERNAL";
                break;
            case 15:
                str = "UNAVAILABLE";
                break;
            case 16:
                str = "DATA_LOSS";
                break;
            case 17:
                str = "UNAUTHENTICATED";
                break;
            default:
                str = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                break;
        }
        sb.append(str);
        sb.append(", description=null}");
        return sb.toString();
    }
}
