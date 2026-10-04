package com.orion.notein.p607ui.creative_library;

import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.p607ui.creative_library.Oooo0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListViewModel$observeDownloadedMaterials$1", m80623f = "DownloadedMaterialListViewModel.kt", m80624l = {55}, m80625m = "invokeSuspend")
public final class C23056Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f71266OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f71267OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0OO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f71268OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.DownloadedMaterialListViewModel$observeDownloadedMaterials$1$2", m80623f = "DownloadedMaterialListViewModel.kt", m80624l = {60, 62}, m80625m = "emit")
        public static final class C19186OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public Oooo0 f71269OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public OooO00o f71270OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public Iterator f71271OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public Collection f71272OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public MaterialDownloadStateEntity f71273OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public /* synthetic */ Object f71274OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public Material f71275OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f71276OooOooO;

            /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
            public int f71277OooOooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19186OooO00o(OooO00o<? super T> oooO00o, Continuation<? super C19186OooO00o> continuation) {
                super(continuation);
                this.f71276OooOooO = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f71274OooOoo = obj;
                this.f71277OooOooo |= Integer.MIN_VALUE;
                return this.f71276OooOooO.emit(null, this);
            }
        }

        public OooO00o(Oooo0 oooo0) {
            this.f71268OooOo0o = oooo0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00db -> B:14:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.util.List<com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity> r28, kotlin.coroutines.Continuation<? super oO00ooO.C32460OooOooO> r29) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.p607ui.creative_library.C23056Oooo0OO.OooO00o.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23056Oooo0OO(Oooo0 oooo0, Continuation<? super C23056Oooo0OO> continuation) {
        super(2, continuation);
        this.f71266OooOo = oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23056Oooo0OO(this.f71266OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23056Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f71267OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Oooo0 oooo0 = this.f71266OooOo;
            C33781o00o0O c33781o00o0O = oooo0.f71240OooO;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, Oooo0.OooO0O0.OooO00o((Oooo0.OooO0O0) value, null, 6)));
            InterfaceC33721OooO0o<List<MaterialDownloadStateEntity>> interfaceC33721OooO0oOooO0oO = oooo0.f71241OooO0Oo.OooO0oO();
            OooO00o oooO00o = new OooO00o(oooo0);
            this.f71267OooOo0o = 1;
            if (interfaceC33721OooO0oOooO0oO.collect(oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
