package androidx.emoji2.text;

import androidx.emoji2.text.OooO0OO;
import java.util.concurrent.ThreadPoolExecutor;
import o000O000.C24385OooOO0o;

/* JADX INFO: renamed from: androidx.emoji2.text.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21867OooO0Oo extends OooO0OO.AbstractC21866OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.AbstractC21866OooO0oo f64724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f64725OooO0O0;

    public C21867OooO0Oo(OooO0OO.AbstractC21866OooO0oo abstractC21866OooO0oo, ThreadPoolExecutor threadPoolExecutor) {
        this.f64724OooO00o = abstractC21866OooO0oo;
        this.f64725OooO0O0 = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.OooO0OO.AbstractC21866OooO0oo
    public final void OooO00o(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f64725OooO0O0;
        try {
            this.f64724OooO00o.OooO00o(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.OooO0OO.AbstractC21866OooO0oo
    public final void OooO0O0(C24385OooOO0o c24385OooOO0o) {
        ThreadPoolExecutor threadPoolExecutor = this.f64725OooO0O0;
        try {
            this.f64724OooO00o.OooO0O0(c24385OooOO0o);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
