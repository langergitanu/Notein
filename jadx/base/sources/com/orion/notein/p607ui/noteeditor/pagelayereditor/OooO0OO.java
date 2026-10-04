package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.global.R;
import com.orion.penkit.models.LayerInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o0OO.C26410OooOOOo;
import o0OOO0Oo.C27042OooOOo0;
import o0OOo0o.C27447o00O0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27456o00O0o0O;
import o0OOooO.C27881OooOO0O;
import o0Ooo0O0.C29397OooOo0O;
import o0Ooo0O0.C29398OooOo0o;
import o0Ooo0O0.C29400OooOoO0;
import o0Ooo0O0.C29401OooOoOO;
import o0oOOOoo.C30837OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33661OoooooO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagelayereditor/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO0Oo", "OooO0OO", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33772OooooOo f74771OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f74772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f74773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27881OooOO0O f74774OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33661OoooooO f74775OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33772OooooOo f74776OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33772OooooOo f74777OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33772OooooOo f74778OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final HashMap f74779OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33781o00o0O f74780OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f74781OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33781o00o0O f74782OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f74783OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f74784OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f74785OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f74786OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f74787OooOo00;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$deletePageLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {485, 487, 498, 506}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public PageLayer f74788OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public List f74789OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f74790OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List f74791OooOoO0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ boolean f74793OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f74794OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ String f74795OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, boolean z, String str2, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f74794OooOoo0 = str;
            this.f74793OooOoo = z;
            this.f74795OooOooO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO(this.f74794OooOoo0, this.f74793OooOoo, this.f74795OooOooO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
        /* JADX WARN: Type inference failed for: r4v9, types: [com.orion.notein.domain.models.page.PageLayer, java.util.List] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            int i;
            Object obj2;
            PageLayer pageLayer;
            Object objOooOO0O;
            List list2;
            List list3;
            Object next;
            PageLayer pageLayer2;
            List list4;
            List list5;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = this.f74790OooOoO;
            String str = this.f74794OooOoo0;
            int i3 = -1;
            String str2 = this.f74795OooOooO;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                list = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
                if (list == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PageLayerViewModel");
                    c20358OooO00o.OooO0OO("deleteLayer. layers is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                List list6 = list;
                if ((list6 instanceof Collection) && list6.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = list6.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (PageLayer.INSTANCE.isRegularLayerId(((PageLayer) it.next()).getId()) && (i = i + 1) < 0) {
                            C34429OooOOo0.OooOOo0();
                            throw null;
                        }
                    }
                }
                obj2 = null;
                if (i == 1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PageLayerViewModel");
                    c20358OooO00o2.OooO0OO("deleteLayer. countRegularLayers is 1", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                Iterator it2 = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) it2.next()).getId(), str2)) {
                        break;
                    }
                    i4++;
                }
                if (i4 == -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("PageLayerViewModel");
                    c20358OooO00o3.OooO0OO("deleteLayer. targetPageLayerIndex is -1", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                pageLayer = (PageLayer) list.get(i4);
                this.f74789OooOo0o = list;
                this.f74788OooOo = pageLayer;
                this.f74790OooOoO = 1;
                if (oooO0OO.f74774OooO0o0.OooO0Oo(pageLayer, str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    pageLayer = this.f74788OooOo;
                    list2 = this.f74789OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    objOooOO0O = obj;
                    obj2 = null;
                    list3 = (List) objOooOO0O;
                    if (list3 != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("PageLayerViewModel");
                        c20358OooO00o4.OooO0OO("deleteLayer. layerInfos is null", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = obj2;
                            break;
                        }
                        next = it3.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((LayerInfo) next).getId(), str2)) {
                            break;
                        }
                    }
                    if (next != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0("PageLayerViewModel");
                        c20358OooO00o5.OooO0OO("deleteLayer. hasDeletedLayer is true", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
                    C19307OooO0OO c19307OooO0OO = new C19307OooO0OO(list3, OooO00o.f74796OooOo);
                    this.f74789OooOo0o = list2;
                    this.f74788OooOo = pageLayer;
                    this.f74791OooOoO0 = list3;
                    this.f74790OooOoO = 3;
                    if (c33772OooooOo.emit(c19307OooO0OO, this) != enumC32485OooO00o) {
                        pageLayer2 = pageLayer;
                        list4 = list3;
                        if (this.f74793OooOoo) {
                        }
                        C34406OooO00o.f123390OooO00o.OooO0o0("deleteLayer end. layerInfos=" + list4, new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    return enumC32485OooO00o;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list5 = this.f74789OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    list4 = list5;
                    C34406OooO00o.f123390OooO00o.OooO0o0("deleteLayer end. layerInfos=" + list4, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                list4 = this.f74791OooOoO0;
                pageLayer2 = this.f74788OooOo;
                list2 = this.f74789OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                obj2 = null;
                if (this.f74793OooOoo) {
                    Iterator it4 = list2.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) it4.next()).getId(), str2)) {
                            i3 = i5;
                            break;
                        }
                        i5++;
                    }
                    C33772OooooOo c33772OooooOo2 = oooO0OO.f74777OooOO0;
                    OooO0O0 oooO0O0 = new OooO0O0(i3, pageLayer2, false);
                    this.f74789OooOo0o = list4;
                    ?? r4 = obj2;
                    this.f74788OooOo = r4;
                    this.f74791OooOoO0 = r4;
                    this.f74790OooOoO = 4;
                    if (c33772OooooOo2.emit(oooO0O0, this) != enumC32485OooO00o) {
                        list5 = list4;
                        list4 = list5;
                    }
                    return enumC32485OooO00o;
                }
                C34406OooO00o.f123390OooO00o.OooO0o0("deleteLayer end. layerInfos=" + list4, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            pageLayer = this.f74788OooOo;
            list = this.f74789OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            obj2 = null;
            this.f74789OooOo0o = list;
            this.f74788OooOo = pageLayer;
            this.f74790OooOoO = 2;
            objOooOO0O = oooO0OO.OooOO0O(str, this);
            if (objOooOO0O != enumC32485OooO00o) {
                list2 = list;
                list3 = (List) objOooOO0O;
                if (list3 != null) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f74796OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f74797OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f74798OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f74799OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o r0 = new com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o.f74797OooOo0o = r0
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o r1 = new com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o
                java.lang.String r2 = "VIEW"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o.f74796OooOo = r1
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o r2 = new com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o
                java.lang.String r3 = "DISPLAY_ITEMS"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o.f74799OooOoO0 = r2
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO00o[] r0 = new com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o[]{r0, r1, r2}
                com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o.f74798OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f74798OooOoO.clone();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f74800OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final PageLayer f74801OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f74802OooO0OO;

        public OooO0O0(int i, PageLayer pageLayer, boolean z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayer, "pageLayer");
            this.f74800OooO00o = i;
            this.f74801OooO0O0 = pageLayer;
            this.f74802OooO0OO = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f74800OooO00o == oooO0O0.f74800OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f74801OooO0O0, oooO0O0.f74801OooO0O0) && this.f74802OooO0OO == oooO0O0.f74802OooO0OO;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f74802OooO0OO) + ((this.f74801OooO0O0.hashCode() + (Integer.hashCode(this.f74800OooO00o) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LayerRemovedOrAddedEvent(pageLayerIndex=");
            sb.append(this.f74800OooO00o);
            sb.append(", pageLayer=");
            sb.append(this.f74801OooO0O0);
            sb.append(", isAdded=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f74802OooO0OO);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C19307OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<LayerInfo> f74803OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f74804OooO0O0;

        public C19307OooO0OO(List<LayerInfo> list, OooO00o oooO00o) {
            this.f74803OooO00o = list;
            this.f74804OooO0O0 = oooO00o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19307OooO0OO)) {
                return false;
            }
            C19307OooO0OO c19307OooO0OO = (C19307OooO0OO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f74803OooO00o, c19307OooO0OO.f74803OooO00o) && this.f74804OooO0O0 == c19307OooO0OO.f74804OooO0O0;
        }

        public final int hashCode() {
            return this.f74804OooO0O0.hashCode() + (this.f74803OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "PdfViewLayersUpdateEvent(layers=" + this.f74803OooO00o + ", option=" + this.f74804OooO0O0 + ")";
        }
    }

    public static final class OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Bitmap f74805OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f74806OooO0O0;

        public OooO0Oo(Bitmap bitmap, long j) {
            this.f74805OooO00o = bitmap;
            this.f74806OooO0O0 = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0Oo)) {
                return false;
            }
            OooO0Oo oooO0Oo = (OooO0Oo) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f74805OooO00o, oooO0Oo.f74805OooO00o) && this.f74806OooO0O0 == oooO0Oo.f74806OooO0O0;
        }

        public final int hashCode() {
            return Long.hashCode(this.f74806OooO0O0) + (this.f74805OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "TnCache(bitmap=" + this.f74805OooO00o + ", timestamp=" + this.f74806OooO0O0 + ")";
        }
    }

    public static final class OooO0o<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ List f74807OooOo0o;

        public OooO0o(List list) {
            this.f74807OooOo0o = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            PageLayer pageLayer = (PageLayer) t;
            List list = this.f74807OooOo0o;
            Iterator it = list.iterator();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), (String) it.next())) {
                    break;
                }
                i3++;
            }
            Integer numValueOf = Integer.valueOf(i3);
            PageLayer pageLayer2 = (PageLayer) t2;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer2.getId(), (String) it2.next())) {
                    i = i2;
                    break;
                }
                i2++;
            }
            return C24536OooO0Oo.OooO0O0(numValueOf, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$_currentPage$1", m80623f = "PageLayerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23439OooO0o0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<String, String, Continuation<? super InterfaceC33721OooO0o<? extends Page>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ String f74808OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ String f74809OooOo0o;

        public C23439OooO0o0(Continuation<? super C23439OooO0o0> continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(String str, String str2, Continuation<? super InterfaceC33721OooO0o<? extends Page>> continuation) {
            C23439OooO0o0 c23439OooO0o0 = OooO0OO.this.new C23439OooO0o0(continuation);
            c23439OooO0o0.f74809OooOo0o = str;
            c23439OooO0o0.f74808OooOo = str2;
            return c23439OooO0o0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String noteId = this.f74809OooOo0o;
            String id = this.f74808OooOo;
            C27449o00O0OoO c27449o00O0OoO = OooO0OO.this.f74772OooO0Oo;
            c27449o00O0OoO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C27456o00O0o0O c27456o00O0o0O = new C27456o00O0o0O(c27449o00O0OoO.f96039OooO0o.OooO0OO(id, noteId), 0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            return C25252OooO0Oo.OooOo0O(c27456o00O0o0O, ExecutorC33873OooO0O0.f122045OooOoO0);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$activePageLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {240}, m80625m = "invokeSuspend")
    public static final class C23440OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74812OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f74813OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f74814OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23440OooO0oO(String str, String str2, Continuation<? super C23440OooO0oO> continuation) {
            super(2, continuation);
            this.f74814OooOoO0 = str;
            this.f74813OooOoO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23440OooO0oO(this.f74814OooOoO0, this.f74813OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23440OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74812OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f74812OooOo0o = 1;
                if (OooO0OO.OooO0o0(OooO0OO.this, this.f74814OooOoO0, this.f74813OooOoO, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$addPageLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_1, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3}, m80625m = "invokeSuspend")
    public static final class C23441OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Object f74815OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74816OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f74817OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public List f74818OooOoO0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ int f74820OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ PageLayer f74821OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ boolean f74822OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23441OooO0oo(PageLayer pageLayer, int i, boolean z, Continuation<? super C23441OooO0oo> continuation) {
            super(2, continuation);
            this.f74821OooOoo0 = pageLayer;
            this.f74820OooOoo = i;
            this.f74822OooOooO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new C23441OooO0oo(this.f74821OooOoo0, this.f74820OooOoo, this.f74822OooOooO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23441OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int iMax;
            PageLayer pageLayer;
            int i;
            String name;
            Set setO0OO00O;
            Context context;
            PageLayer pageLayerCopy$default;
            Object objOooOO0O;
            PageLayer pageLayer2;
            List list;
            Object next;
            List list2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = this.f74817OooOoO;
            boolean z = this.f74822OooOooO;
            PageLayer pageLayer3 = this.f74821OooOoo0;
            OooO0OO oooO0OO = OooO0OO.this;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List list3 = (List) oooO0OO.f74786OooOOoo.f121747OooOo0o.getValue();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer3.getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                    iMax = 0;
                } else {
                    int i3 = this.f74820OooOoo;
                    if (list3 != null) {
                        Iterator it = list3.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) it.next()).getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                                break;
                            }
                            i4++;
                        }
                        iMax = Math.max(i3, i4 + 1);
                    } else {
                        iMax = i3;
                    }
                }
                boolean z2 = kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer3.getId(), LayerInfo.PAPER_THEME_LAYER_ID) || kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer3.getId(), "default");
                if (z && !z2 && ((name = pageLayer3.getName()) == null || name.length() == 0)) {
                    if (list3 != null) {
                        List list4 = list3;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((PageLayer) it2.next()).getName());
                        }
                        setO0OO00O = OooOo.o0OO00O(arrayList);
                    } else {
                        setO0OO00O = C34438OooOoo0.f123458OooOo0o;
                    }
                    int i5 = 1;
                    while (true) {
                        Object[] objArr = {Integer.valueOf(i5)};
                        context = oooO0OO.f74773OooO0o;
                        String string = context.getString(R.string.page_layer_default_name_template, objArr);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        if (!setO0OO00O.contains(string) || i5 >= 36) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 >= 36) {
                        pageLayerCopy$default = PageLayer.copy$default(this.f74821OooOoo0, null, null, false, null, context.getString(R.string.unnamed_page_layer_name), 15, null);
                    } else {
                        String string2 = context.getString(R.string.page_layer_default_name_template, Integer.valueOf(i5));
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        pageLayerCopy$default = PageLayer.copy$default(this.f74821OooOoo0, null, null, false, null, string2, 15, null);
                    }
                    pageLayer = pageLayerCopy$default;
                } else {
                    pageLayer = pageLayer3;
                }
                String noteId = pageLayer3.getNoteId();
                this.f74815OooOo = pageLayer;
                this.f74816OooOo0o = iMax;
                this.f74817OooOoO = 1;
                C27881OooOO0O c27881OooOO0O = oooO0OO.f74774OooO0o0;
                c27881OooOO0O.getClass();
                Object objOooO0O0 = c27881OooOO0O.OooO0O0(iMax, noteId, com.facebook.soloader.OooOo.OooO0oO(pageLayer), this);
                if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                    i = iMax;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) this.f74815OooOo;
                        C32446OooOOOo.OooO0O0(obj);
                        list = list2;
                        C34406OooO00o.f123390OooO00o.OooO0o0("addPageLayer end. layerInfos=" + list, new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    i = this.f74816OooOo0o;
                    List list5 = this.f74818OooOoO0;
                    pageLayer2 = (PageLayer) this.f74815OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    list = list5;
                    if (z) {
                        C33772OooooOo c33772OooooOo = oooO0OO.f74777OooOO0;
                        OooO0O0 oooO0O0 = new OooO0O0(i, pageLayer2, true);
                        this.f74815OooOo = list;
                        this.f74818OooOoO0 = null;
                        this.f74817OooOoO = 4;
                        if (c33772OooooOo.emit(oooO0O0, this) != enumC32485OooO00o) {
                            list2 = list;
                            list = list2;
                        }
                        return enumC32485OooO00o;
                    }
                    C34406OooO00o.f123390OooO00o.OooO0o0("addPageLayer end. layerInfos=" + list, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                i = this.f74816OooOo0o;
                pageLayer2 = (PageLayer) this.f74815OooOo;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0O = obj;
                list = (List) objOooOO0O;
                if (list != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PageLayerViewModel");
                    c20358OooO00o.OooO0OO("addPageLayer. layerInfos is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((LayerInfo) next).getId(), pageLayer3.getId())) {
                        break;
                    }
                }
                if (next == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PageLayerViewModel");
                    c20358OooO00o2.OooO0OO("addPageLayer. hasAddedLayer is false", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                C33772OooooOo c33772OooooOo2 = oooO0OO.f74776OooO0oo;
                C19307OooO0OO c19307OooO0OO = new C19307OooO0OO(list, OooO00o.f74796OooOo);
                this.f74815OooOo = pageLayer2;
                this.f74818OooOoO0 = list;
                this.f74816OooOo0o = i;
                this.f74817OooOoO = 3;
                if (c33772OooooOo2.emit(c19307OooO0OO, this) != enumC32485OooO00o) {
                    if (z) {
                    }
                    C34406OooO00o.f123390OooO00o.OooO0o0("addPageLayer end. layerInfos=" + list, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
            i = this.f74816OooOo0o;
            pageLayer = (PageLayer) this.f74815OooOo;
            C32446OooOOOo.OooO0O0(obj);
            String noteId2 = pageLayer3.getNoteId();
            this.f74815OooOo = pageLayer;
            this.f74816OooOo0o = i;
            this.f74817OooOoO = 2;
            objOooOO0O = oooO0OO.OooOO0O(noteId2, this);
            if (objOooOO0O != enumC32485OooO00o) {
                pageLayer2 = pageLayer;
                list = (List) objOooOO0O;
                if (list != null) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$pageLayerTnVOList$1", m80623f = "PageLayerViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends PageLayer>, Page, String, Long, Continuation<? super List<? extends C30837OooO00o>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Page f74823OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f74824OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ String f74826OooOoO0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(5, continuation);
        }

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            ((Number) obj4).longValue();
            OooOO0 oooOO02 = OooO0OO.this.new OooOO0((Continuation) serializable);
            oooOO02.f74824OooOo0o = (List) obj;
            oooOO02.f74823OooOo = (Page) obj2;
            oooOO02.f74826OooOoO0 = (String) obj3;
            return oooOO02.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayListO0ooOoO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list = this.f74824OooOo0o;
            Page page = this.f74823OooOo;
            String str = this.f74826OooOoO0;
            if (list == null || page == null) {
                return C34434OooOoO.f123453OooOo0o;
            }
            if (list.isEmpty()) {
                return com.facebook.soloader.OooOo.OooO0oO(new C30837OooO00o("", page.getNoteId(), page.getId(), 0, "", new Size(0, 0), 0L, false, true, false));
            }
            C32443OooOOO<Integer, Integer> tnSize = page.getTnSize();
            OooO0OO oooO0OO = OooO0OO.this;
            Size size = new Size(tnSize.f116638OooOo0o.intValue(), tnSize.f116637OooOo.intValue());
            oooO0OO.getClass();
            int iOooO0o = o000000O.OooO0o(120);
            int width = size.getWidth();
            int height = size.getHeight();
            Size size2 = width > iOooO0o ? new Size(iOooO0o, (int) (height * (iOooO0o / width))) : height > iOooO0o ? new Size((int) (width * (iOooO0o / height)), iOooO0o) : size;
            OooO0OO oooO0OO2 = OooO0OO.this;
            synchronized (oooO0OO2.f74779OooOO0o) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        C30837OooO00o c30837OooO00o = null;
                        if (i < 0) {
                            C34429OooOOo0.OooOOo();
                            throw null;
                        }
                        PageLayer pageLayer = (PageLayer) obj2;
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                            OooO0Oo oooO0Oo = (OooO0Oo) oooO0OO2.f74779OooOO0o.get("tn_" + pageLayer.getId() + C18115b5.CONNECTOR + pageLayer.getNoteId() + C18115b5.CONNECTOR + page.getId());
                            long j = oooO0Oo != null ? oooO0Oo.f74806OooO0O0 : 0L;
                            String id = pageLayer.getId();
                            String noteId = pageLayer.getNoteId();
                            String id2 = page.getId();
                            String name = pageLayer.getName();
                            if (name == null) {
                                name = "";
                            }
                            c30837OooO00o = new C30837OooO00o(id, noteId, id2, i, name, size2, j, pageLayer.getVisible(), kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), str), list.size() > 2);
                        }
                        if (c30837OooO00o != null) {
                            arrayList.add(c30837OooO00o);
                        }
                        i = i2;
                    }
                    arrayListO0ooOoO = OooOo.o0ooOoO(arrayList);
                    Collections.reverse(arrayListO0ooOoO);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayListO0ooOoO;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$special$$inlined$flatMapLatest$1", m80623f = "PageLayerViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteContent>, String, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74827OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74828OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74830OooOoO0;

        public OooOO0O(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super NoteContent> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
            OooOO0O oooOO0O = OooO0OO.this.new OooOO0O(continuation);
            oooOO0O.f74827OooOo = interfaceC33723OooO0oO;
            oooOO0O.f74830OooOoO0 = str;
            return oooOO0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74828OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74827OooOo;
                String noteId = (String) this.f74830OooOoO0;
                C27449o00O0OoO c27449o00O0OoO = OooO0OO.this.f74772OooO0Oo;
                c27449o00O0OoO.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                C26410OooOOOo c26410OooOOOoOooO00o = c27449o00O0OoO.f96035OooO00o.OooO00o(noteId);
                this.f74828OooOo0o = 1;
                C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
                Object objCollect = c26410OooOOOoOooO00o.collect(new C27447o00O0Oo(interfaceC33723OooO0oO, c27449o00O0OoO), this);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$special$$inlined$flatMapLatest$2", m80623f = "PageLayerViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class C23442OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Page>, InterfaceC33721OooO0o<? extends Page>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74831OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74832OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74833OooOoO0;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super Page> interfaceC33723OooO0oO, InterfaceC33721OooO0o<? extends Page> interfaceC33721OooO0o, Continuation<? super C32460OooOooO> continuation) {
            C23442OooOO0o c23442OooOO0o = new C23442OooOO0o(3, continuation);
            c23442OooOO0o.f74831OooOo = interfaceC33723OooO0oO;
            c23442OooOO0o.f74833OooOoO0 = interfaceC33721OooO0o;
            return c23442OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74832OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74831OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f74833OooOoO0;
                this.f74832OooOo0o = 1;
                if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0o, this) == enumC32485OooO00o) {
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

    public static final class OooOOO implements InterfaceC33721OooO0o<C32443OooOOO<? extends String, ? extends List<? extends String>>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f74834OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74835OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$special$$inlined$map$1$2", m80623f = "PageLayerViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19308OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74836OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74837OooOo0o;

                public C19308OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74837OooOo0o = obj;
                    this.f74836OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f74835OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19308OooO00o c19308OooO00o;
                if (continuation instanceof C19308OooO00o) {
                    c19308OooO00o = (C19308OooO00o) continuation;
                    int i = c19308OooO00o.f74836OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19308OooO00o.f74836OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19308OooO00o = new C19308OooO00o(continuation);
                    }
                }
                Object obj2 = c19308OooO00o.f74837OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19308OooO00o.f74836OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    NoteContent noteContent = (NoteContent) obj;
                    C32443OooOOO c32443OooOOO = noteContent == null ? new C32443OooOOO("", C34434OooOoO.f123453OooOo0o) : new C32443OooOOO(noteContent.getId(), noteContent.getPageLayerIds());
                    c19308OooO00o.f74836OooOo = 1;
                    if (this.f74835OooOo0o.emit(c32443OooOOO, c19308OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOO(C33769Ooooo0o c33769Ooooo0o) {
            this.f74834OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super C32443OooOOO<? extends String, ? extends List<? extends String>>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74834OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$special$$inlined$flatMapLatest$3", m80623f = "PageLayerViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends PageLayer>>, C32443OooOOO<? extends String, ? extends List<? extends String>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ InterfaceC33723OooO0oO f74839OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74840OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f74842OooOoO0;

        public OooOOO0(Continuation continuation) {
            super(3, continuation);
        }

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends PageLayer>> interfaceC33723OooO0oO, C32443OooOOO<? extends String, ? extends List<? extends String>> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
            OooOOO0 oooOOO0 = OooO0OO.this.new OooOOO0(continuation);
            oooOOO0.f74839OooOo = interfaceC33723OooO0oO;
            oooOOO0.f74842OooOoO0 = c32443OooOOO;
            return oooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74840OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f74839OooOo;
                C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f74842OooOoO0;
                String noteId = (String) c32443OooOOO.f116638OooOo0o;
                List ids = (List) c32443OooOOO.f116637OooOo;
                C27881OooOO0O c27881OooOO0O = OooO0OO.this.f74774OooO0o0;
                c27881OooOO0O.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(ids, "ids");
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                C27042OooOOo0 c27042OooOOo0OooOOO = c27881OooOO0O.f98543OooO00o.OooOOO(noteId, ids);
                this.f74840OooOo0o = 1;
                C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
                Object objCollect = c27042OooOOo0OooOOO.collect(new C29397OooOo0O(interfaceC33723OooO0oO, ids), this);
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect != enumC32485OooO00o) {
                    objCollect = C32460OooOooO.f116667OooO00o;
                }
                if (objCollect == enumC32485OooO00o) {
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

    public static final class OooOOOO implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f74843OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74844OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0OO$OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$special$$inlined$map$2$2", m80623f = "PageLayerViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19309OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74845OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74846OooOo0o;

                public C19309OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74846OooOo0o = obj;
                    this.f74845OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f74844OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19309OooO00o c19309OooO00o;
                if (continuation instanceof C19309OooO00o) {
                    c19309OooO00o = (C19309OooO00o) continuation;
                    int i = c19309OooO00o.f74845OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19309OooO00o.f74845OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19309OooO00o = new C19309OooO00o(continuation);
                    }
                }
                Object obj2 = c19309OooO00o.f74846OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19309OooO00o.f74845OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    NoteContent noteContent = (NoteContent) obj;
                    String activatedPageLayerId = noteContent == null ? null : noteContent.getActivatedPageLayerId();
                    c19309OooO00o.f74845OooOo = 1;
                    if (this.f74844OooOo0o.emit(activatedPageLayerId, c19309OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOOO(C33769Ooooo0o c33769Ooooo0o) {
            this.f74843OooOo0o = c33769Ooooo0o;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74843OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0OO(C27449o00O0OoO c27449o00O0OoO, C27881OooOO0O c27881OooOO0O, Context context) {
        this.f74772OooO0Oo = c27449o00O0OoO;
        this.f74774OooO0o0 = c27881OooOO0O;
        this.f74773OooO0o = context;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        C33661OoooooO c33661OoooooO = new C33661OoooooO(executorServiceNewFixedThreadPool);
        this.f74775OooO0oO = c33661OoooooO;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f74776OooO0oo = c33772OooooOoOooO0O0;
        this.f74771OooO = c33772OooooOoOooO0O0;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f74777OooOO0 = c33772OooooOoOooO0O02;
        this.f74778OooOO0O = c33772OooooOoOooO0O02;
        this.f74779OooOO0o = new HashMap();
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(0L);
        this.f74781OooOOO0 = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(Boolean.FALSE);
        this.f74780OooOOO = c33781o00o0OOooO00o2;
        this.f74782OooOOOO = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o("");
        this.f74783OooOOOo = c33781o00o0OOooO00o3;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33781o00o0OOooO00o3, new OooOO0O(null));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f74785OooOOo0 = c33769Ooooo0oOooOoO0;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o("");
        this.f74784OooOOo = c33781o00o0OOooO00o4;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(new C33763OoooOOO(c33781o00o0OOooO00o3, c33781o00o0OOooO00o4, new C23439OooO0o0(null)), new C23442OooOO0o(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        OooOOO oooOOO = new OooOOO(c33769Ooooo0oOooOoO0);
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(oooOOO, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, new C32443OooOOO("", c34434OooOoO));
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(new OooOOOO(c33769Ooooo0oOooOoO0), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO03, new OooOOO0(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), c33661OoooooO), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f74786OooOOoo = c33769Ooooo0oOooOoO05;
        this.f74787OooOo00 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO05, c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO04, c33781o00o0OOooO00o, new OooOO0(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), c33661OoooooO), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(OooO0OO oooO0OO, PageLayer pageLayer, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29401OooOoOO c29401OooOoOO;
        List list2;
        List list3;
        oooO0OO.getClass();
        if (abstractC32479OooO0OO instanceof C29401OooOoOO) {
            c29401OooOoOO = (C29401OooOoOO) abstractC32479OooO0OO;
            int i = c29401OooOoOO.f104264OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29401OooOoOO.f104264OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29401OooOoOO = new C29401OooOoOO(oooO0OO, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c29401OooOoOO.f104263OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29401OooOoOO.f104264OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            String noteId = pageLayer.getNoteId();
            c29401OooOoOO.f104261OooOo0o = oooO0OO;
            c29401OooOoOO.f104260OooOo = pageLayer;
            c29401OooOoOO.f104264OooOoOO = 1;
            if (oooO0OO.f74774OooO0o0.OooO0o(pageLayer, list, noteId, c29401OooOoOO) != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = (List) c29401OooOoOO.f104261OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0O);
                C34406OooO00o.f123390OooO00o.OooO0o0("mergeLayersLocked end. layerInfos=" + list3, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0OO = (OooO0OO) c29401OooOoOO.f104261OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
            list2 = (List) objOooOO0O;
            if (list2 != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0OO("mergeLayersLocked. layerInfos is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
            C19307OooO0OO c19307OooO0OO = new C19307OooO0OO(list2, OooO00o.f74799OooOoO0);
            c29401OooOoOO.f104261OooOo0o = list2;
            c29401OooOoOO.f104264OooOoOO = 3;
            if (c33772OooooOo.emit(c19307OooO0OO, c29401OooOoOO) != obj) {
                list3 = list2;
                C34406OooO00o.f123390OooO00o.OooO0o0("mergeLayersLocked end. layerInfos=" + list3, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return obj;
        }
        pageLayer = c29401OooOoOO.f104260OooOo;
        oooO0OO = (OooO0OO) c29401OooOoOO.f104261OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        String noteId2 = pageLayer.getNoteId();
        c29401OooOoOO.f104261OooOo0o = oooO0OO;
        c29401OooOoOO.f104260OooOo = null;
        c29401OooOoOO.f104264OooOoOO = 2;
        objOooOO0O = oooO0OO.OooOO0O(noteId2, c29401OooOoOO);
        if (objOooOO0O != obj) {
            list2 = (List) objOooOO0O;
            if (list2 != null) {
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(OooO0OO oooO0OO, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29398OooOo0o c29398OooOo0o;
        List list;
        List list2;
        oooO0OO.getClass();
        if (abstractC32479OooO0OO instanceof C29398OooOo0o) {
            c29398OooOo0o = (C29398OooOo0o) abstractC32479OooO0OO;
            int i = c29398OooOo0o.f104250OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29398OooOo0o.f104250OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29398OooOo0o = new C29398OooOo0o(oooO0OO, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c29398OooOo0o.f104249OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29398OooOo0o.f104250OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "none") || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.PAPER_THEME_LAYER_ID) || kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.UNSPECIFIED_LAYER_ID)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "PageLayerViewModel", "activePageLayerLocked. invalid pageLayerId=", str), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            c29398OooOo0o.f104247OooOo0o = oooO0OO;
            c29398OooOo0o.f104246OooOo = str2;
            c29398OooOo0o.f104250OooOoOO = 1;
            if (oooO0OO.f74774OooO0o0.OooO00o(str, str2, c29398OooOo0o) != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c29398OooOo0o.f104247OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0O);
                C34406OooO00o.f123390OooO00o.OooO0o0("activePageLayerLocked end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0OO = (OooO0OO) c29398OooOo0o.f104247OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
            list = (List) objOooOO0O;
            if (list != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PageLayerViewModel");
                c20358OooO00o2.OooO0OO("activePageLayerLocked. layerInfos is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
            C19307OooO0OO c19307OooO0OO = new C19307OooO0OO(list, OooO00o.f74797OooOo0o);
            c29398OooOo0o.f104247OooOo0o = list;
            c29398OooOo0o.f104250OooOoOO = 3;
            if (c33772OooooOo.emit(c19307OooO0OO, c29398OooOo0o) != obj) {
                list2 = list;
                C34406OooO00o.f123390OooO00o.OooO0o0("activePageLayerLocked end. layerInfos=" + list2, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return obj;
        }
        str2 = c29398OooOo0o.f104246OooOo;
        oooO0OO = (OooO0OO) c29398OooOo0o.f104247OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        c29398OooOo0o.f104247OooOo0o = oooO0OO;
        c29398OooOo0o.f104246OooOo = null;
        c29398OooOo0o.f104250OooOoOO = 2;
        objOooOO0O = oooO0OO.OooOO0O(str2, c29398OooOo0o);
        if (objOooOO0O != obj) {
            list = (List) objOooOO0O;
            if (list != null) {
            }
        }
        return obj;
    }

    public static String OooOO0(C30837OooO00o c30837OooO00o) {
        return "tn_" + c30837OooO00o.f110196OooO00o + C18115b5.CONNECTOR + c30837OooO00o.f110197OooO0O0 + C18115b5.CONNECTOR + c30837OooO00o.f110198OooO0OO;
    }

    public final void OooO(String str, String str2, boolean z) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("deleteLayer start. layerId=", str, ", noteId=", str2), new Object[0]);
        if (PageLayer.INSTANCE.isRegularLayerId(str)) {
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), this.f74775OooO0oO, null, new OooO(str2, z, str, null), 2);
            c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("deleteLayer: layerId=", str), new Object[0]);
        }
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        synchronized (this.f74779OooOO0o) {
            try {
                Iterator it = this.f74779OooOO0o.entrySet().iterator();
                while (it.hasNext()) {
                    Bitmap bitmap = ((OooO0Oo) ((Map.Entry) it.next()).getValue()).f74805OooO00o;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f74779OooOO0o.clear();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oO(String pageLayerId, String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerId, "pageLayerId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C34406OooO00o.f123390OooO00o.OooO0o0("activePageLayer start. pageLayerId=".concat(pageLayerId), new Object[0]);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), this.f74775OooO0oO, null, new C23440OooO0oO(pageLayerId, noteId, null), 2);
    }

    public final void OooO0oo(int i, PageLayer pageLayer, boolean z) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), this.f74775OooO0oO, null, new C23441OooO0oo(pageLayer, i, z, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[LOOP:0: B:29:0x008a->B:31:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29400OooOoO0 c29400OooOoO0;
        OooO0OO oooO0OO;
        NoteContent noteContent;
        if (abstractC32479OooO0OO instanceof C29400OooOoO0) {
            c29400OooOoO0 = (C29400OooOoO0) abstractC32479OooO0OO;
            int i = c29400OooOoO0.f104259OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29400OooOoO0.f104259OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29400OooOoO0 = new C29400OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOoO0 = c29400OooOoO0.f104258OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29400OooOoO0.f104259OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoO0);
            c29400OooOoO0.f104256OooOo0o = this;
            c29400OooOoO0.f104255OooOo = str;
            c29400OooOoO0.f104259OooOoOO = 1;
            objOooOoO0 = this.f74772OooO0Oo.OooOoO0(str, c29400OooOoO0);
            if (objOooOoO0 != enumC32485OooO00o) {
                oooO0OO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteContent = (NoteContent) c29400OooOoO0.f104256OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOoO0);
            Iterable<PageLayer> iterable = (Iterable) objOooOoO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            for (PageLayer pageLayer : iterable) {
                arrayList.add(pageLayer.toLayerInfo(kotlin.jvm.internal.OooOOO0.OooO0O0(pageLayer.getId(), noteContent.getActivatedPageLayerId())));
            }
            return arrayList;
        }
        str = c29400OooOoO0.f104255OooOo;
        oooO0OO = (OooO0OO) c29400OooOoO0.f104256OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOoO0);
        NoteContent noteContent2 = (NoteContent) objOooOoO0;
        if (noteContent2 == null) {
            C33781o00o0O c33781o00o0O = oooO0OO.f74780OooOOO;
            Boolean bool = Boolean.FALSE;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            return null;
        }
        C27881OooOO0O c27881OooOO0O = oooO0OO.f74774OooO0o0;
        List<String> pageLayerIds = noteContent2.getPageLayerIds();
        c29400OooOoO0.f104256OooOo0o = noteContent2;
        c29400OooOoO0.f104255OooOo = null;
        c29400OooOoO0.f104259OooOoOO = 2;
        Object objOooO0o0 = c27881OooOO0O.OooO0o0(str, pageLayerIds, c29400OooOoO0);
        if (objOooO0o0 != enumC32485OooO00o) {
            objOooOoO0 = objOooO0o0;
            noteContent = noteContent2;
            Iterable<PageLayer> iterable2 = (Iterable) objOooOoO0;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            while (r9.hasNext()) {
            }
            return arrayList2;
        }
        return enumC32485OooO00o;
    }

    public final PageLayer OooOO0o(List<? extends InterfaceC31284OooO0O0> displayItems) {
        Object next;
        String layerId;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        Iterator<T> it = displayItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) next;
            if (interfaceC31284OooO0O0.doesSupportLayer() && PageLayer.INSTANCE.isRegularLayerId(interfaceC31284OooO0O0.getLayerId())) {
                break;
            }
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) next;
        if (interfaceC31284OooO0O02 == null || (layerId = interfaceC31284OooO0O02.getLayerId()) == null) {
            return null;
        }
        List list = (List) this.f74786OooOOoo.f121747OooOo0o.getValue();
        if (list == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PageLayerViewModel");
            c20358OooO00o.OooO0OO("getOrCreateNextLayerByDisplayItem. layers is null", new Object[0]);
            return null;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) it2.next()).getId(), layerId)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PageLayerViewModel");
            c20358OooO00o2.OooO0OO("getOrCreateNextLayerByDisplayItem. itemLayerIndex is -1", new Object[0]);
            return null;
        }
        if (i != list.size() - 1) {
            int i2 = i + 1;
            if (PageLayer.INSTANCE.isRegularLayerId(((PageLayer) list.get(i2)).getId())) {
                PageLayer pageLayer = (PageLayer) list.get(i2);
                OooO0oO(pageLayer.getId(), pageLayer.getNoteId());
                return pageLayer;
            }
        }
        PageLayer pageLayer2 = new PageLayer(C24761OooO.OooO00o("toString(...)"), (String) this.f74783OooOOOo.getValue(), true, null, null, 16, null);
        OooO0oo(i + 1, pageLayer2, true);
        return pageLayer2;
    }

    public final PageLayer OooOOO0(List<? extends InterfaceC31284OooO0O0> displayItems) {
        Object next;
        String layerId;
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        Iterator<T> it = displayItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) next;
            if (interfaceC31284OooO0O0.doesSupportLayer() && PageLayer.INSTANCE.isRegularLayerId(interfaceC31284OooO0O0.getLayerId())) {
                break;
            }
        }
        InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) next;
        if (interfaceC31284OooO0O02 == null || (layerId = interfaceC31284OooO0O02.getLayerId()) == null) {
            return null;
        }
        List list = (List) this.f74786OooOOoo.f121747OooOo0o.getValue();
        if (list == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PageLayerViewModel");
            c20358OooO00o.OooO0OO("getOrCreatePreviousLayerByDisplayItem. layers is null", new Object[0]);
            return null;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PageLayer) it2.next()).getId(), layerId)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PageLayerViewModel");
            c20358OooO00o2.OooO0OO("getOrCreatePreviousLayerByDisplayItem. itemLayerIndex is -1", new Object[0]);
            return null;
        }
        String str = (String) this.f74783OooOOOo.getValue();
        if (i != 0) {
            int i2 = i - 1;
            if (PageLayer.INSTANCE.isRegularLayerId(((PageLayer) list.get(i2)).getId())) {
                PageLayer pageLayer = (PageLayer) list.get(i2);
                OooO0oO(pageLayer.getId(), pageLayer.getNoteId());
                return pageLayer;
            }
        }
        PageLayer pageLayer2 = new PageLayer(C24761OooO.OooO00o("toString(...)"), str, true, null, null, 16, null);
        OooO0oo(i, pageLayer2, true);
        return pageLayer2;
    }
}
