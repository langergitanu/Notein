package o0000o0O;

import java.io.FileInputStream;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0000o0O.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.FileReadScope", m80623f = "FileStorage.kt", m80624l = {169, 178}, m80625m = "readData$suspendImpl")
public final class C24274Oooo0O0<T> extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public FileInputStream f81691OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f81692OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24275Oooo0OO<T> f81693OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f81694OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f81695OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24274Oooo0O0(C24275Oooo0OO c24275Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f81693OooOoO = c24275Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f81694OooOoO0 = obj;
        this.f81695OooOoOO |= Integer.MIN_VALUE;
        return C24275Oooo0OO.OooO0o(this.f81693OooOoO, this);
    }
}
