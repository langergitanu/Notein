package com.orion.notein.p607ui.creative_library;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import kotlin.coroutines.Continuation;
import o0OOoo0O.C27831OooO;
import o0OOoo0O.C27851OooOo0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$applyMaterial$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_4}, m80625m = "invokeSuspend")
public final class C23030OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo f71050OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71051OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71052OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23030OooO0o0(C23028OooO0Oo c23028OooO0Oo, String str, Continuation<? super C23030OooO0o0> continuation) {
        super(2, continuation);
        this.f71050OooOo = c23028OooO0Oo;
        this.f71052OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23030OooO0o0(this.f71050OooOo, this.f71052OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23030OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        C33781o00o0O c33781o00o0O;
        Object value;
        Object value2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71051OooOo0o;
        C23028OooO0Oo c23028OooO0Oo = this.f71050OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f71051OooOo0o = 1;
            objOooO00o = c23028OooO0Oo.f71004OooO.OooO00o(this.f71052OooOoO0, this);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = obj;
        }
        C27831OooO.OooO00o oooO00o = (C27831OooO.OooO00o) objOooO00o;
        if (oooO00o instanceof C27831OooO.OooO00o.OooO0O0) {
            do {
                c33781o00o0O = c23028OooO0Oo.f71010OooOO0;
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C23028OooO0Oo.C19176OooO0Oo.OooO00o((C23028OooO0Oo.C19176OooO0Oo) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, 196607)));
            Material material = c23028OooO0Oo.f71013OooOOO;
            if (material != null) {
                C27851OooOo0 c27851OooOo0 = c23028OooO0Oo.f71008OooO0oO;
                c27851OooOo0.getClass();
                DownloadState downloadState = DownloadState.DOWNLOADED;
                MaterialActionType actionType = material.getActionType(downloadState, true);
                c27851OooOo0.getClass();
                String actionLabel = material.getActionLabel(downloadState, true);
                do {
                    value2 = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value2, C23028OooO0Oo.C19176OooO0Oo.OooO00o((C23028OooO0Oo.C19176OooO0Oo) value2, false, null, null, null, null, null, null, null, null, null, null, null, null, null, actionType, actionLabel, false, null, 212991)));
            }
        } else if (!(oooO00o instanceof C27831OooO.OooO00o.C19873OooO00o)) {
            throw new C32442OooOO0o();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
