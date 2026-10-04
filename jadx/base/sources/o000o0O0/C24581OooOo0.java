package o000o0O0;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: o000o0O0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24581OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f83284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f83285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f83286OooO0OO;

    public C24581OooOo0(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f83284OooO00o = data;
        this.f83285OooO0O0 = action;
        this.f83286OooO0OO = type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f83284OooO00o;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f83285OooO0O0;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f83286OooO0OO;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
