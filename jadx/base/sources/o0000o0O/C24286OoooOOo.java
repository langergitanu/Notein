package o0000o0O;

import java.io.FileOutputStream;
import o0000o0O.C24287OoooOo0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0000o0O.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.MultiProcessCoordinator$Companion", m80623f = "MultiProcessCoordinator.android.kt", m80624l = {182}, m80625m = "getExclusiveFileLockWithRetryIfDeadlock")
public final class C24286OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f81729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public FileOutputStream f81730OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f81731OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81732OooOoO0;

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81732OooOoO0 = obj;
        this.f81731OooOoO |= Integer.MIN_VALUE;
        return C24287OoooOo0.OooO00o.OooO00o(null, this);
    }
}
