package com.orion.notein.p607ui.notelist;

import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.orion.notein.ui.notelist.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$buildPlaceholderVOList$1", m80623f = "NoteListViewModel.kt", m80624l = {1786}, m80625m = "invokeSuspend")
public final class C23637OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO0OO f77257OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Set f77258OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f77259OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f77260OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<NotePlaceHolder> f77261OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f77262OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Set<String> f77263OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23637OooO0oO(List<NotePlaceHolder> list, Set<String> set, OooO0OO oooO0OO, Continuation<? super C23637OooO0oO> continuation) {
        super(2, continuation);
        this.f77261OooOoOO = list;
        this.f77263OooOoo0 = set;
        this.f77262OooOoo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23637OooO0oO(this.f77261OooOoOO, this.f77263OooOoo0, this.f77262OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23637OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        OooO0OO oooO0OO;
        Set<String> set;
        Iterator it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f77259OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it2 = this.f77261OooOoOO.iterator();
            Set<String> set2 = this.f77263OooOoo0;
            oooO0OO = this.f77262OooOoo;
            set = set2;
            it = it2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f77260OooOoO0;
            oooO0OO = this.f77257OooOo;
            set = this.f77258OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            NotePlaceHolder notePlaceHolder = (NotePlaceHolder) it.next();
            if (set.contains(notePlaceHolder.getId())) {
                C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
                String[] strArr = {notePlaceHolder.getId()};
                this.f77258OooOo0o = set;
                this.f77257OooOo = oooO0OO;
                this.f77260OooOoO0 = it;
                this.f77259OooOoO = 1;
                if (c27449o00O0OoO.Oooo0oO(strArr, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
