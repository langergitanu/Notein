package o0000o0O;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.C33898OooO0Oo;

/* JADX INFO: renamed from: o0000o0O.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.MultiProcessCoordinator", m80623f = "MultiProcessCoordinator.android.kt", m80624l = {62, 87}, m80625m = "tryLock")
public final class C24292OooooO0<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public FileInputStream f81753OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33898OooO0Oo f81754OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f81755OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public FileLock f81756OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f81757OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f81758OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C24287OoooOo0 f81759OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24292OooooO0(C24287OoooOo0 c24287OoooOo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81759OooOoo0 = c24287OoooOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81757OooOoOO = obj;
        this.f81758OooOoo |= Integer.MIN_VALUE;
        return this.f81759OooOoo0.OooO00o(null, this);
    }
}
