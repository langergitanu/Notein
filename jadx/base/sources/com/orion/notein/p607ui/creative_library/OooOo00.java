package com.orion.notein.p607ui.creative_library;

import androidx.core.app.OooO;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
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
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibrarySearchViewModel$applyMaterial$1", m80623f = "CreativeLibrarySearchViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23040OooOOoo f71170OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71171OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f71172OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(C23040OooOOoo c23040OooOOoo, String str, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f71170OooOo = c23040OooOOoo;
        this.f71172OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo00(this.f71170OooOo, this.f71172OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        C33781o00o0O c33781o00o0O;
        Object value;
        C23040OooOOoo.OooO0O0 oooO0O0;
        ArrayList arrayList;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71171OooOo0o;
        C23040OooOOoo c23040OooOOoo = this.f71170OooOo;
        String str = this.f71172OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f71171OooOo0o = 1;
            objOooO00o = c23040OooOOoo.f71147OooO0oo.OooO00o(str, this);
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
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o(OooO.OooO0O0(c20358OooO00o, "CreativeLibrarySearchVM", "Material applied: ", str), new Object[0]);
            do {
                c33781o00o0O = c23040OooOOoo.f71150OooOO0o;
                value = c33781o00o0O.getValue();
                oooO0O0 = (C23040OooOOoo.OooO0O0) value;
                List<C23033OooOO0o.OooO00o> list = oooO0O0.f71159OooO0O0;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C23033OooOO0o.OooO00o OooO00o2 : list) {
                    if (OooOOO0.OooO0O0(OooO00o2.f71088OooO00o, str)) {
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
            } while (!c33781o00o0O.OooO(value, C23040OooOOoo.OooO0O0.OooO00o(oooO0O0, arrayList, 13)));
        } else {
            if (!(oooO00o instanceof C27831OooO.OooO00o.C19873OooO00o)) {
                throw new C32442OooOO0o();
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CreativeLibrarySearchVM");
            c20358OooO00o2.OooO0Oo(((C27831OooO.OooO00o.C19873OooO00o) oooO00o).f98326OooO0O0, OooO00o.OooO00o("Failed to apply material: ", str), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
