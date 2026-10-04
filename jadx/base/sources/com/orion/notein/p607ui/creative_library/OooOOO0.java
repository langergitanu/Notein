package com.orion.notein.p607ui.creative_library;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOoo0O.C27831OooO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryListViewModel$applyMaterial$1", m80623f = "CreativeLibraryListViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_5}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23033OooOO0o f71122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71123OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71124OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(C23033OooOO0o c23033OooOO0o, String str, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f71122OooOo = c23033OooOO0o;
        this.f71124OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO0(this.f71122OooOo, this.f71124OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C33781o00o0O c33781o00o0O;
        Object value;
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71123OooOo0o;
        C23033OooOO0o c23033OooOO0o = this.f71122OooOo;
        String str = this.f71124OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f71123OooOo0o = 1;
            obj = c23033OooOO0o.f71081OooO0oo.OooO00o(str, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27831OooO.OooO00o oooO00o = (C27831OooO.OooO00o) obj;
        if (oooO00o instanceof C27831OooO.OooO00o.OooO0O0) {
            do {
                c33781o00o0O = c23033OooOO0o.f71084OooOO0o;
                value = c33781o00o0O.getValue();
                List<C23033OooOO0o.OooO00o> list = (List) value;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C23033OooOO0o.OooO00o OooO00o2 : list) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO00o2.f71088OooO00o, str)) {
                        Material material = OooO00o2.f71097OooOO0O;
                        DownloadState downloadState = DownloadState.DOWNLOADED;
                        MaterialActionType actionType = material.getActionType(downloadState, true);
                        if (actionType == null) {
                            actionType = OooO00o2.f71094OooO0oO;
                        }
                        String actionLabel = material.getActionLabel(downloadState, true);
                        if (actionLabel == null) {
                            actionLabel = OooO00o2.f71095OooO0oo;
                        }
                        OooO00o2 = C23033OooOO0o.OooO00o.OooO00o(OooO00o2, actionType, actionLabel, actionType == MaterialActionType.GO_TO_CREATE, null, 1599);
                    }
                    arrayList.add(OooO00o2);
                }
            } while (!c33781o00o0O.OooO(value, arrayList));
        } else if (!(oooO00o instanceof C27831OooO.OooO00o.C19873OooO00o)) {
            throw new C32442OooOO0o();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
