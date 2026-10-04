package com.orion.notein.p607ui.notelist;

import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.p607ui.notelist.OooO0OO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.OooOo00;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$coreDataFlow$1", m80623f = "NoteListViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements OooOo00<List<? extends NoteMeta>, List<? extends Folder>, List<? extends Page>, List<? extends NotePlaceHolder>, Map<String, ? extends Integer>, Continuation<? super OooO0OO.C19405OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f77099OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f77100OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ List f77101OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ List f77102OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Map f77103OooOoOO;

    public OooO(Continuation<? super OooO> continuation) {
        super(6, continuation);
    }

    @Override // oO0O000o.OooOo00
    public final Object Oooo0OO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        OooO oooO = new OooO((Continuation) serializable);
        oooO.f77100OooOo0o = (List) obj;
        oooO.f77099OooOo = (List) obj2;
        oooO.f77102OooOoO0 = (List) obj3;
        oooO.f77101OooOoO = (List) obj4;
        oooO.f77103OooOoOO = (Map) obj5;
        return oooO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return new OooO0OO.C19405OooO0OO(this.f77100OooOo0o, this.f77099OooOo, this.f77102OooOoO0, this.f77101OooOoO, this.f77103OooOoOO);
    }
}
