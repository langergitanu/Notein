package o0000oO0;

import OooooO0.C21294OooOO0O;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;

/* JADX INFO: renamed from: o0000oO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24325OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<File> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24326OooO0OO f81889OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f81890OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24325OooO0O0(Context context, C24326OooO0OO c24326OooO0OO) {
        super(0);
        this.f81890OooOo0o = context;
        this.f81889OooOo = c24326OooO0OO;
    }

    @Override // oO0O000o.OooO00o
    public final File invoke() {
        Context applicationContext = this.f81890OooOo0o;
        OooOOO0.OooO0o(applicationContext, "applicationContext");
        return C21294OooOO0O.OooO0Oo(applicationContext, this.f81889OooOo.f81891OooO00o);
    }
}
