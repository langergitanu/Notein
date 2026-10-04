package o0000o0O;

import java.io.File;

/* JADX INFO: renamed from: o0000o0O.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24290Ooooo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<File> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24287OoooOo0 f81746OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24290Ooooo00(C24287OoooOo0 c24287OoooOo0) {
        super(0);
        this.f81746OooOo0o = c24287OoooOo0;
    }

    @Override // oO0O000o.OooO00o
    public final File invoke() {
        C24287OoooOo0 c24287OoooOo0 = this.f81746OooOo0o;
        File file = new File(c24287OoooOo0.f81735OooO0O0.getAbsolutePath() + c24287OoooOo0.f81739OooO0o0);
        C24287OoooOo0.OooO0o(c24287OoooOo0, file);
        return file;
    }
}
