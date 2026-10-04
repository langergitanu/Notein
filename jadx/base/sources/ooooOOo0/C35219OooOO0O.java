package ooooOOo0;

import okhttp3.Response;

/* JADX INFO: renamed from: ooooOOo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35219OooOO0O extends RuntimeException {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final transient C35238OooOoO<?> f126447OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f126448OooOo0o;

    public C35219OooOO0O(C35238OooOoO<?> c35238OooOoO) {
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = c35238OooOoO.f126541OooO00o;
        int i = response.f124259OooOoO;
        sb.append(i);
        sb.append(" ");
        sb.append(response.f124260OooOoO0);
        super(sb.toString());
        this.f126448OooOo0o = i;
        this.f126447OooOo = c35238OooOoO;
    }
}
