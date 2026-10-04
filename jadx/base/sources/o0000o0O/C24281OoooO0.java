package o0000o0O;

import java.io.FileOutputStream;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0000o0O.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.FileWriteScope", m80623f = "FileStorage.kt", m80624l = {201}, m80625m = "writeData")
public final class C24281OoooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public FileOutputStream f81714OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public FileOutputStream f81715OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24283OoooO0O<Object> f81716OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81717OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f81718OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24281OoooO0(C24283OoooO0O c24283OoooO0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81716OooOoO = c24283OoooO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81717OooOoO0 = obj;
        this.f81718OooOoOO |= Integer.MIN_VALUE;
        return this.f81716OooOoO.OooO0O0(null, this);
    }
}
