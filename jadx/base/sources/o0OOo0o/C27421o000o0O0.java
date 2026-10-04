package o0OOo0o;

import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.C24030OooOoo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o000o0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteInFileUseCase", m80623f = "NoteInFileUseCase.kt", m80624l = {1152}, m80625m = "restorePdfFile")
public final class C27421o000o0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f95744OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27387o0000o0 f95745OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f95746OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C24030OooOoo f95747OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public File f95748OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27387o0000o0 f95749OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f95750OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f95751OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27421o000o0O0(C27387o0000o0 c27387o0000o0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95749OooOoo = c27387o0000o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95750OooOoo0 = obj;
        this.f95751OooOooO |= Integer.MIN_VALUE;
        return C27387o0000o0.OooOooo(this.f95749OooOoo, null, null, this);
    }
}
