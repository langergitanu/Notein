package com.orion.notein.p607ui.notelist;

import com.orion.notein.domain.models.Label;
import com.orion.notein.p607ui.notelist.OooO0OO;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$allLabelsFlow$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C23635OooO0Oo extends AbstractC32476OooO implements InterfaceC32509OooOOo<Map<String, ? extends List<? extends Label>>, Map<String, ? extends List<? extends Label>>, Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>>, Continuation<? super OooO0OO.OooO0Oo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Map f77228OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Map f77229OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Map f77230OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(Map<String, ? extends List<? extends Label>> map, Map<String, ? extends List<? extends Label>> map2, Map<C32443OooOOO<? extends String, ? extends String>, ? extends List<? extends Label>> map3, Continuation<? super OooO0OO.OooO0Oo> continuation) {
        C23635OooO0Oo c23635OooO0Oo = new C23635OooO0Oo(4, continuation);
        c23635OooO0Oo.f77229OooOo0o = map;
        c23635OooO0Oo.f77228OooOo = map2;
        c23635OooO0Oo.f77230OooOoO0 = map3;
        return c23635OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new OooO0OO.OooO0Oo(this.f77229OooOo0o, this.f77228OooOo, this.f77230OooOoO0);
    }
}
