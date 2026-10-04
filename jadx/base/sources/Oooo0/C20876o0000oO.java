package Oooo0;

import Oooo0.o000O0;
import java.util.List;
import kotlin.jvm.internal.C24034Oooo00O;
import o00000.C24048OooO0oo;
import o00000.C24073OoooO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20876o0000oO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<List<? extends o00000.OooO0o>, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O0.OooO0O0 f60055OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24048OooO0oo f60056OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<C24073OoooO> f60057OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20876o0000oO(C24048OooO0oo c24048OooO0oo, o000O0.OooO0O0 oooO0O0, C24034Oooo00O c24034Oooo00O) {
        super(1);
        this.f60056OooOo0o = c24048OooO0oo;
        this.f60055OooOo = oooO0O0;
        this.f60057OooOoO0 = c24034Oooo00O;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(List<? extends o00000.OooO0o> list) {
        List<? extends o00000.OooO0o> it = list;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C24073OoooO c24073OoooO = this.f60057OooOoO0.f80942OooOo0o;
        C24048OooO0oo editProcessor = this.f60056OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(editProcessor, "editProcessor");
        o000O0.OooO0O0 onValueChange = this.f60055OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(onValueChange, "onValueChange");
        o00000.Oooo0 oooo0OooO00o = editProcessor.OooO00o(it);
        if (c24073OoooO != null) {
            c24073OoooO.OooO0O0(null, oooo0OooO00o);
        }
        onValueChange.invoke(oooo0OooO00o);
        return C32460OooOooO.f116667OooO00o;
    }
}
