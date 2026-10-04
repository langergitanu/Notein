package com.orion.notein.p607ui.creative_library;

import OooOo.C20485OooOoO;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import OoooooO.C21445Oooo;
import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.OooOOO;
import com.huawei.hms.network.embedded.C18293o1;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Font;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;
import com.orion.notein.domain.models.material.Palette;
import com.orion.notein.domain.models.material.Sticker;
import com.orion.notein.domain.models.material.TemplateBook;
import com.orion.notein.domain.models.material.TemplateCollection;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import o0OOoo0O.C27831OooO;
import o0OOoo0O.C27851OooOo0;
import o0OOoo0O.C27852OooOo00;
import o0Oo0oOo.C28327OooOo0O;
import o0Oo0oOo.C28367o00000Oo;
import o0Oo0oOo.o00000OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/OooO0Oo;", "Landroidx/lifecycle/Ooooooo;", "OooO0O0", "OooO0Oo", "OooO0OO", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C23028OooO0Oo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final List<OooO0O0> f71003OooOOOo = C34429OooOOo0.OooOO0o(new OooO0O0("preview-1", Color.parseColor("#5B6FAF"), null), new OooO0O0("preview-2", Color.parseColor("#C4C7D1"), null), new OooO0O0("preview-3", Color.parseColor("#AAB8D2"), null), new OooO0O0("preview-4", Color.parseColor("#BFC1C6"), null));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27831OooO f71004OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f71005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27304OooOo f71006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27310OooOoO0 f71007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27851OooOo0 f71008OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27852OooOo00 f71009OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f71010OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f71011OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33772OooooOo f71012OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Material f71013OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33768Ooooo00 f71014OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public String f71015OooOOOO;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Set<? extends String>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f71017OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = C23028OooO0Oo.this.new OooO00o(continuation);
            oooO00o.f71017OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Set<? extends String> set, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(set, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Set set = (Set) this.f71017OooOo0o;
            C23028OooO0Oo c23028OooO0Oo = C23028OooO0Oo.this;
            Material material = c23028OooO0Oo.f71013OooOOO;
            if (material == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33781o00o0O c33781o00o0O = c23028OooO0Oo.f71010OooOO0;
            C19176OooO0Oo c19176OooO0Oo = (C19176OooO0Oo) c33781o00o0O.getValue();
            if (c19176OooO0Oo.f71027OooO00o) {
                return C32460OooOooO.f116667OooO00o;
            }
            boolean zContains = set.contains(material.getId());
            C27851OooOo0 c27851OooOo0 = c23028OooO0Oo.f71008OooO0oO;
            c27851OooOo0.getClass();
            DownloadState downloadState = zContains ? DownloadState.DOWNLOADED : DownloadState.NOT_DOWNLOADED;
            boolean z = c19176OooO0Oo.f71043OooOOo0;
            MaterialActionType actionType = material.getActionType(downloadState, z);
            c27851OooOo0.getClass();
            String actionLabel = material.getActionLabel(zContains ? DownloadState.DOWNLOADED : DownloadState.NOT_DOWNLOADED, z);
            if (actionType != c19176OooO0Oo.f71040OooOOOO || !OooOOO0.OooO0O0(actionLabel, c19176OooO0Oo.f71041OooOOOo)) {
                while (true) {
                    Object value = c33781o00o0O.getValue();
                    String str = actionLabel;
                    MaterialActionType materialActionType = actionType;
                    if (c33781o00o0O.OooO(value, C19176OooO0Oo.OooO00o((C19176OooO0Oo) value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, materialActionType, str, false, null, 212991))) {
                        break;
                    }
                    actionType = materialActionType;
                    actionLabel = str;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f71018OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f71019OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f71020OooO0OO;

        public OooO0O0(String id, int i, String str) {
            OooOOO0.OooO0oO(id, "id");
            this.f71018OooO00o = id;
            this.f71019OooO0O0 = i;
            this.f71020OooO0OO = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f71018OooO00o, oooO0O0.f71018OooO00o) && this.f71019OooO0O0 == oooO0O0.f71019OooO0O0 && OooOOO0.OooO0O0(this.f71020OooO0OO, oooO0O0.f71020OooO0OO);
        }

        public final int hashCode() {
            int iOooO00o = C20785Oooo00o.OooO00o(this.f71019OooO0O0, this.f71018OooO00o.hashCode() * 31, 31);
            String str = this.f71020OooO0OO;
            return iOooO00o + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewItem(id=");
            sb.append(this.f71018OooO00o);
            sb.append(", placeholderColor=");
            sb.append(this.f71019OooO0O0);
            sb.append(", imageUrl=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f71020OooO0OO, ")");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0OO */
    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0OO$OooO00o */
        public static final class OooO00o extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o f71021OooO00o = new OooO00o();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0OO$OooO0O0 */
        public static final class OooO0O0 extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f71022OooO00o;

            public OooO0O0(String materialId) {
                OooOOO0.OooO0oO(materialId, "materialId");
                this.f71022OooO00o = materialId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && OooOOO0.OooO0O0(this.f71022OooO00o, ((OooO0O0) obj).f71022OooO00o);
            }

            public final int hashCode() {
                return this.f71022OooO00o.hashCode();
            }

            public final String toString() {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("NavigateToMyTemplate(materialId="), this.f71022OooO00o, ")");
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public static final class C19174OooO0OO extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19174OooO0OO f71023OooO00o = new C19174OooO0OO();
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0OO$OooO0Oo, reason: collision with other inner class name */
        public static final class C19175OooO0Oo extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f71024OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f71025OooO0O0;

            public C19175OooO0Oo(String materialId, int i) {
                OooOOO0.OooO0oO(materialId, "materialId");
                this.f71024OooO00o = materialId;
                this.f71025OooO0O0 = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19175OooO0Oo)) {
                    return false;
                }
                C19175OooO0Oo c19175OooO0Oo = (C19175OooO0Oo) obj;
                return OooOOO0.OooO0O0(this.f71024OooO00o, c19175OooO0Oo.f71024OooO00o) && this.f71025OooO0O0 == c19175OooO0Oo.f71025OooO0O0;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f71025OooO0O0) + (this.f71024OooO00o.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowPurchaseDialog(materialId=");
                sb.append(this.f71024OooO00o);
                sb.append(", priceCents=");
                return C21023OooO0Oo.OooO0OO(")", this.f71025OooO0O0, sb);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static final class C19176OooO0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final String f71026OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f71027OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f71028OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<OooO0O0> f71029OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f71030OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f71031OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f71032OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final String f71033OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final String f71034OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final String f71035OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final String f71036OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final String f71037OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final String f71038OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final String f71039OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final MaterialActionType f71040OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final String f71041OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final List<C23033OooOO0o.OooO00o> f71042OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f71043OooOOo0;

        public C19176OooO0Oo() {
            this(0);
        }

        public static C19176OooO0Oo OooO00o(C19176OooO0Oo c19176OooO0Oo, boolean z, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, MaterialActionType materialActionType, String str13, boolean z2, List list2, int i) {
            boolean z3 = (i & 1) != 0 ? c19176OooO0Oo.f71027OooO00o : z;
            String str14 = (i & 2) != 0 ? c19176OooO0Oo.f71028OooO0O0 : str;
            List previews = (i & 4) != 0 ? c19176OooO0Oo.f71029OooO0OO : list;
            String title = (i & 8) != 0 ? c19176OooO0Oo.f71030OooO0Oo : str2;
            String description = (i & 16) != 0 ? c19176OooO0Oo.f71032OooO0o0 : str3;
            String specParam1Label = (i & 32) != 0 ? c19176OooO0Oo.f71031OooO0o : str4;
            String specParam1Value = (i & 64) != 0 ? c19176OooO0Oo.f71033OooO0oO : str5;
            String specParam2Label = (i & 128) != 0 ? c19176OooO0Oo.f71034OooO0oo : str6;
            String specParam2Value = (i & 256) != 0 ? c19176OooO0Oo.f71026OooO : str7;
            String specParam3Label = (i & 512) != 0 ? c19176OooO0Oo.f71035OooOO0 : str8;
            String specParam3Value = (i & 1024) != 0 ? c19176OooO0Oo.f71036OooOO0O : str9;
            String creatorId = (i & 2048) != 0 ? c19176OooO0Oo.f71037OooOO0o : str10;
            String creatorName = (i & 4096) != 0 ? c19176OooO0Oo.f71039OooOOO0 : str11;
            String creatorDesc = (i & 8192) != 0 ? c19176OooO0Oo.f71038OooOOO : str12;
            boolean z4 = z3;
            MaterialActionType actionType = (i & 16384) != 0 ? c19176OooO0Oo.f71040OooOOOO : materialActionType;
            String actionLabel = (i & 32768) != 0 ? c19176OooO0Oo.f71041OooOOOo : str13;
            String str15 = str14;
            boolean z5 = (i & 65536) != 0 ? c19176OooO0Oo.f71043OooOOo0 : z2;
            List recommendations = (i & 131072) != 0 ? c19176OooO0Oo.f71042OooOOo : list2;
            c19176OooO0Oo.getClass();
            OooOOO0.OooO0oO(previews, "previews");
            OooOOO0.OooO0oO(title, "title");
            OooOOO0.OooO0oO(description, "description");
            OooOOO0.OooO0oO(specParam1Label, "specParam1Label");
            OooOOO0.OooO0oO(specParam1Value, "specParam1Value");
            OooOOO0.OooO0oO(specParam2Label, "specParam2Label");
            OooOOO0.OooO0oO(specParam2Value, "specParam2Value");
            OooOOO0.OooO0oO(specParam3Label, "specParam3Label");
            OooOOO0.OooO0oO(specParam3Value, "specParam3Value");
            OooOOO0.OooO0oO(creatorId, "creatorId");
            OooOOO0.OooO0oO(creatorName, "creatorName");
            OooOOO0.OooO0oO(creatorDesc, "creatorDesc");
            OooOOO0.OooO0oO(actionType, "actionType");
            OooOOO0.OooO0oO(actionLabel, "actionLabel");
            OooOOO0.OooO0oO(recommendations, "recommendations");
            return new C19176OooO0Oo(z4, str15, previews, title, description, specParam1Label, specParam1Value, specParam2Label, specParam2Value, specParam3Label, specParam3Value, creatorId, creatorName, creatorDesc, actionType, actionLabel, z5, recommendations);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19176OooO0Oo)) {
                return false;
            }
            C19176OooO0Oo c19176OooO0Oo = (C19176OooO0Oo) obj;
            return this.f71027OooO00o == c19176OooO0Oo.f71027OooO00o && OooOOO0.OooO0O0(this.f71028OooO0O0, c19176OooO0Oo.f71028OooO0O0) && OooOOO0.OooO0O0(this.f71029OooO0OO, c19176OooO0Oo.f71029OooO0OO) && OooOOO0.OooO0O0(this.f71030OooO0Oo, c19176OooO0Oo.f71030OooO0Oo) && OooOOO0.OooO0O0(this.f71032OooO0o0, c19176OooO0Oo.f71032OooO0o0) && OooOOO0.OooO0O0(this.f71031OooO0o, c19176OooO0Oo.f71031OooO0o) && OooOOO0.OooO0O0(this.f71033OooO0oO, c19176OooO0Oo.f71033OooO0oO) && OooOOO0.OooO0O0(this.f71034OooO0oo, c19176OooO0Oo.f71034OooO0oo) && OooOOO0.OooO0O0(this.f71026OooO, c19176OooO0Oo.f71026OooO) && OooOOO0.OooO0O0(this.f71035OooOO0, c19176OooO0Oo.f71035OooOO0) && OooOOO0.OooO0O0(this.f71036OooOO0O, c19176OooO0Oo.f71036OooOO0O) && OooOOO0.OooO0O0(this.f71037OooOO0o, c19176OooO0Oo.f71037OooOO0o) && OooOOO0.OooO0O0(this.f71039OooOOO0, c19176OooO0Oo.f71039OooOOO0) && OooOOO0.OooO0O0(this.f71038OooOOO, c19176OooO0Oo.f71038OooOOO) && this.f71040OooOOOO == c19176OooO0Oo.f71040OooOOOO && OooOOO0.OooO0O0(this.f71041OooOOOo, c19176OooO0Oo.f71041OooOOOo) && this.f71043OooOOo0 == c19176OooO0Oo.f71043OooOOo0 && OooOOO0.OooO0O0(this.f71042OooOOo, c19176OooO0Oo.f71042OooOOo);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f71027OooO00o) * 31;
            String str = this.f71028OooO0O0;
            return this.f71042OooOOo.hashCode() + o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.f71040OooOOOO.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C21445Oooo.OooO00o(this.f71029OooO0OO, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f71030OooO0Oo), 31, this.f71032OooO0o0), 31, this.f71031OooO0o), 31, this.f71033OooO0oO), 31, this.f71034OooO0oo), 31, this.f71026OooO), 31, this.f71035OooOO0), 31, this.f71036OooOO0O), 31, this.f71037OooOO0o), 31, this.f71039OooOOO0), 31, this.f71038OooOOO)) * 31, 31, this.f71041OooOOOo), 31, this.f71043OooOOo0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UiState(isLoading=");
            sb.append(this.f71027OooO00o);
            sb.append(", error=");
            sb.append(this.f71028OooO0O0);
            sb.append(", previews=");
            sb.append(this.f71029OooO0OO);
            sb.append(", title=");
            sb.append(this.f71030OooO0Oo);
            sb.append(", description=");
            sb.append(this.f71032OooO0o0);
            sb.append(", specParam1Label=");
            sb.append(this.f71031OooO0o);
            sb.append(", specParam1Value=");
            sb.append(this.f71033OooO0oO);
            sb.append(", specParam2Label=");
            sb.append(this.f71034OooO0oo);
            sb.append(", specParam2Value=");
            sb.append(this.f71026OooO);
            sb.append(", specParam3Label=");
            sb.append(this.f71035OooOO0);
            sb.append(", specParam3Value=");
            sb.append(this.f71036OooOO0O);
            sb.append(", creatorId=");
            sb.append(this.f71037OooOO0o);
            sb.append(", creatorName=");
            sb.append(this.f71039OooOOO0);
            sb.append(", creatorDesc=");
            sb.append(this.f71038OooOOO);
            sb.append(", actionType=");
            sb.append(this.f71040OooOOOO);
            sb.append(", actionLabel=");
            sb.append(this.f71041OooOOOo);
            sb.append(", isApplied=");
            sb.append(this.f71043OooOOo0);
            sb.append(", recommendations=");
            return OooOOO.OooO0O0(")", sb, this.f71042OooOOo);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C19176OooO0Oo(int i) {
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            this(false, null, c34434OooOoO, "", "", "", "", "", "", "", "", "", "", "", MaterialActionType.DOWNLOAD, "下载", false, c34434OooOoO);
        }

        public C19176OooO0Oo(boolean z, String str, List<OooO0O0> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, MaterialActionType actionType, String str13, boolean z2, List<C23033OooOO0o.OooO00o> list2) {
            OooOOO0.OooO0oO(actionType, "actionType");
            this.f71027OooO00o = z;
            this.f71028OooO0O0 = str;
            this.f71029OooO0OO = list;
            this.f71030OooO0Oo = str2;
            this.f71032OooO0o0 = str3;
            this.f71031OooO0o = str4;
            this.f71033OooO0oO = str5;
            this.f71034OooO0oo = str6;
            this.f71026OooO = str7;
            this.f71035OooOO0 = str8;
            this.f71036OooOO0O = str9;
            this.f71037OooOO0o = str10;
            this.f71039OooOOO0 = str11;
            this.f71038OooOOO = str12;
            this.f71040OooOOOO = actionType;
            this.f71041OooOOOo = str13;
            this.f71043OooOOo0 = z2;
            this.f71042OooOOo = list2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$loadMaterial$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {129, 131}, m80625m = "invokeSuspend")
    public static final class C23029OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71045OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f71046OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23029OooO0o0(String str, Continuation<? super C23029OooO0o0> continuation) {
            super(2, continuation);
            this.f71046OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C23028OooO0Oo.this.new C23029OooO0o0(this.f71046OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23029OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
        
            if (com.orion.notein.p607ui.creative_library.C23028OooO0Oo.OooO0o0(r8, r2, r31) == r0) goto L22;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object objOooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71045OooOo0o;
            String str = this.f71046OooOoO0;
            C23028OooO0Oo c23028OooO0Oo = C23028OooO0Oo.this;
            try {
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o.OooO0Oo(e, "Failed to load material: ".concat(str), new Object[0]);
                C33781o00o0O c33781o00o0O = c23028OooO0Oo.f71010OooOO0;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C19176OooO0Oo.OooO00o((C19176OooO0Oo) value, false, e.getMessage(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262140)));
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33781o00o0O c33781o00o0O2 = c23028OooO0Oo.f71010OooOO0;
                do {
                    value2 = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value2, C19176OooO0Oo.OooO00o((C19176OooO0Oo) value2, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262140)));
                InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c23028OooO0Oo.f71007OooO0o0;
                this.f71045OooOo0o = 1;
                objOooO0o = interfaceC27310OooOoO0.OooO0o(str, this);
                if (objOooO0o == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                List<OooO0O0> list = C23028OooO0Oo.f71003OooOOOo;
                c23028OooO0Oo.getClass();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new C23031OooO0oO(c23028OooO0Oo, str, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o = obj;
            Material material = (Material) objOooO0o;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
            c20358OooO00o2.OooO00o("loadMaterial success: title=" + material.getTitle() + ", type=" + material.getClass().getSimpleName(), new Object[0]);
            this.f71045OooOo0o = 2;
        }
    }

    public C23028OooO0Oo(Context context, InterfaceC27310OooOoO0 materialRepository, InterfaceC27304OooOo downloadRepository, C27851OooOo0 c27851OooOo0, C27852OooOo00 c27852OooOo00, C27831OooO c27831OooO) {
        OooOOO0.OooO0oO(materialRepository, "materialRepository");
        OooOOO0.OooO0oO(downloadRepository, "downloadRepository");
        this.f71005OooO0Oo = context;
        this.f71007OooO0o0 = materialRepository;
        this.f71006OooO0o = downloadRepository;
        this.f71008OooO0oO = c27851OooOo0;
        this.f71009OooO0oo = c27852OooOo00;
        this.f71004OooO = c27831OooO;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new C19176OooO0Oo(0));
        this.f71010OooOO0 = c33781o00o0OOooO00o;
        this.f71011OooOO0O = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f71012OooOO0o = c33772OooooOoOooO0O0;
        this.f71014OooOOO0 = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O0);
        C25252OooO0Oo.OooOo0o(new o000Oo0(downloadRepository.OooO0o(), new OooO00o(null), 1), o0OoOo0.OooO00o(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C23028OooO0Oo c23028OooO0Oo, Material material, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28327OooOo0O c28327OooOo0O;
        ArrayList arrayList;
        List<OooO0O0> list;
        List<Material.SpecItem> list2;
        String string;
        o00000OO o00000oo2;
        int iOrdinal;
        Object value;
        C19176OooO0Oo c19176OooO0Oo;
        String title;
        String description;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C32443OooOOO c32443OooOOO;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C23028OooO0Oo c23028OooO0Oo2 = c23028OooO0Oo;
        Material material2 = material;
        c23028OooO0Oo2.getClass();
        if (abstractC32479OooO0OO instanceof C28327OooOo0O) {
            c28327OooOo0O = (C28327OooOo0O) abstractC32479OooO0OO;
            int i = c28327OooOo0O.f100459OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28327OooOo0O.f100459OooOooO = i - Integer.MIN_VALUE;
            } else {
                c28327OooOo0O = new C28327OooOo0O(c23028OooO0Oo2, abstractC32479OooO0OO);
            }
        }
        Object obj = c28327OooOo0O.f100458OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28327OooOo0O.f100459OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c23028OooO0Oo2.f71013OooOOO = material2;
            c23028OooO0Oo2.f71015OooOOOO = material2.getId();
            List<Material.SpecItem> displaySpecs = material2.getDisplaySpecs();
            List<Material.SpecItem> list3 = displaySpecs;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                Material.SpecItem specItem = (Material.SpecItem) it.next();
                String key = specItem.getLabelKey();
                Context context = c23028OooO0Oo2.f71005OooO0Oo;
                OooOOO0.OooO0oO(context, "context");
                OooOOO0.OooO0oO(key, "key");
                List<Material.SpecItem> list4 = displaySpecs;
                switch (key.hashCode()) {
                    case -1439500848:
                        if (key.equals("orientation")) {
                            key = context.getString(R.string.creative_library_spec_orientation);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case -1354842768:
                        if (key.equals("colors")) {
                            key = context.getString(R.string.creative_library_spec_colors);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case -903459084:
                        if (key.equals("sheets")) {
                            key = context.getString(R.string.creative_library_spec_count);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case -791592328:
                        if (key.equals("weight")) {
                            key = context.getString(R.string.creative_library_spec_weight);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case 3148879:
                        if (key.equals("font")) {
                            key = context.getString(R.string.creative_library_spec_font);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case 3530753:
                        if (key.equals("size")) {
                            key = context.getString(R.string.creative_library_spec_size);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                    case 94851343:
                        if (key.equals(C18293o1.f55803f)) {
                        }
                        break;
                    case 100526016:
                        if (key.equals(FirebaseAnalytics.Param.ITEMS)) {
                        }
                        break;
                    case 106426308:
                        if (key.equals("pages")) {
                            key = context.getString(R.string.creative_library_spec_pages);
                            OooOOO0.OooO0o(key, "getString(...)");
                        }
                        break;
                }
                Object value2 = specItem.getValue();
                Iterator it2 = it;
                if (value2 instanceof PageSize) {
                    PageSize pageSize = (PageSize) value2;
                    OooOOO0.OooO0oO(pageSize, "pageSize");
                    int i3 = C28367o00000Oo.f100561OooO0O0[pageSize.ordinal()];
                    if (i3 == 1) {
                        string = "A4";
                    } else if (i3 == 2) {
                        string = "A5";
                    } else if (i3 == 3) {
                        string = "Letter";
                    } else {
                        if (i3 != 4) {
                            throw new C32442OooOO0o();
                        }
                        string = context.getString(R.string.creative_library_page_size_custom);
                        OooOOO0.OooO0o(string, "getString(...)");
                    }
                } else if (value2 instanceof Orientation) {
                    Orientation orientation = (Orientation) value2;
                    OooOOO0.OooO0oO(orientation, "orientation");
                    int i4 = C28367o00000Oo.f100560OooO00o[orientation.ordinal()];
                    if (i4 == 1) {
                        string = context.getString(R.string.creative_library_orientation_portrait);
                        OooOOO0.OooO0o(string, "getString(...)");
                    } else if (i4 == 2) {
                        string = context.getString(R.string.creative_library_orientation_landscape);
                        OooOOO0.OooO0o(string, "getString(...)");
                    } else {
                        if (i4 != 3) {
                            throw new C32442OooOO0o();
                        }
                        string = context.getString(R.string.creative_library_orientation_both);
                        OooOOO0.OooO0o(string, "getString(...)");
                    }
                } else if (value2 instanceof Integer) {
                    String labelKey = specItem.getLabelKey();
                    int iIntValue = ((Number) value2).intValue();
                    switch (labelKey.hashCode()) {
                        case -1354842768:
                            if (labelKey.equals("colors")) {
                                o00000oo2 = o00000OO.f100557OooOoO;
                            } else if (material2 instanceof TemplateCollection) {
                                o00000oo2 = o00000OO.f100556OooOo0o;
                            } else if (material2 instanceof TemplateBook) {
                                o00000oo2 = o00000OO.f100555OooOo;
                            } else if (material2 instanceof Sticker) {
                                o00000oo2 = o00000OO.f100558OooOoO0;
                            } else if (material2 instanceof Palette) {
                                o00000oo2 = o00000OO.f100557OooOoO;
                            } else {
                                if (!(material2 instanceof Font)) {
                                    throw new C32442OooOO0o();
                                }
                                o00000oo2 = o00000OO.f100558OooOoO0;
                            }
                            iOrdinal = o00000oo2.ordinal();
                            if (iOrdinal != 0) {
                                string = context.getString(R.string.creative_library_spec_count_sheets, Integer.valueOf(iIntValue));
                                OooOOO0.OooO0o(string, "getString(...)");
                            } else if (iOrdinal == 1) {
                                string = context.getString(R.string.creative_library_spec_count_pages, Integer.valueOf(iIntValue));
                                OooOOO0.OooO0o(string, "getString(...)");
                            } else if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new C32442OooOO0o();
                                }
                                string = context.getString(R.string.creative_library_spec_count_colors, Integer.valueOf(iIntValue));
                                OooOOO0.OooO0o(string, "getString(...)");
                            } else {
                                string = context.getString(R.string.creative_library_spec_count_items, Integer.valueOf(iIntValue));
                                OooOOO0.OooO0o(string, "getString(...)");
                            }
                            break;
                        case -903459084:
                            if (labelKey.equals("sheets")) {
                                o00000oo2 = o00000OO.f100556OooOo0o;
                            }
                            iOrdinal = o00000oo2.ordinal();
                            if (iOrdinal != 0) {
                            }
                            break;
                        case 100526016:
                            if (labelKey.equals(FirebaseAnalytics.Param.ITEMS)) {
                                o00000oo2 = o00000OO.f100558OooOoO0;
                            }
                            iOrdinal = o00000oo2.ordinal();
                            if (iOrdinal != 0) {
                            }
                            break;
                        case 106426308:
                            if (labelKey.equals("pages")) {
                                o00000oo2 = o00000OO.f100555OooOo;
                            }
                            iOrdinal = o00000oo2.ordinal();
                            if (iOrdinal != 0) {
                            }
                            break;
                    }
                } else {
                    string = value2 instanceof String ? (String) value2 : value2.toString();
                }
                arrayList.add(new C32443OooOOO(key, string));
                displaySpecs = list4;
                it = it2;
            }
            List<Material.SpecItem> list5 = displaySpecs;
            List<String> previewUrls = material2.getPreviewUrls();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(previewUrls, 10));
            int i5 = 0;
            for (Object obj2 : previewUrls) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                arrayList2.add(new OooO0O0(C21532OooOOo.OooO0OO(i5, "preview-"), -3355444, (String) obj2));
                i5 = i6;
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            List<OooO0O0> list6 = arrayList2;
            if (zIsEmpty) {
                list6 = f71003OooOOOo;
            }
            List<OooO0O0> list7 = list6;
            c28327OooOo0O.f100453OooOo0o = c23028OooO0Oo2;
            c28327OooOo0O.f100452OooOo = material2;
            c28327OooOo0O.f100455OooOoO0 = list5;
            c28327OooOo0O.f100454OooOoO = arrayList;
            c28327OooOo0O.f100456OooOoOO = list7;
            c28327OooOo0O.f100459OooOooO = 1;
            Object objOooO00o = c23028OooO0Oo2.f71008OooO0oO.OooO00o(material2, c28327OooOo0O);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            list = list7;
            obj = objOooO00o;
            list2 = list5;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<OooO0O0> list8 = c28327OooOo0O.f100456OooOoOO;
            ArrayList arrayList3 = c28327OooOo0O.f100454OooOoO;
            list2 = c28327OooOo0O.f100455OooOoO0;
            Material material3 = c28327OooOo0O.f100452OooOo;
            C23028OooO0Oo c23028OooO0Oo3 = c28327OooOo0O.f100453OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list = list8;
            arrayList = arrayList3;
            c23028OooO0Oo2 = c23028OooO0Oo3;
            material2 = material3;
        }
        C27851OooOo0.OooO00o oooO00o = (C27851OooOo0.OooO00o) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
        String title2 = material2.getTitle();
        int size = list.size();
        String name = material2.getCreator().getName();
        int size2 = list2.size();
        DownloadState downloadState = oooO00o.f98414OooO00o;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(size, "updateUiState: title=", title2, ", previewCount=", ", creator=");
        OooOO0.OooO0O0.OooO0Oo(size2, name, ", specsCount=", ", downloadState=", sbOooO0OO);
        sbOooO0OO.append(downloadState);
        sbOooO0OO.append(", isApplied=");
        sbOooO0OO.append(oooO00o.f98415OooO0O0);
        sbOooO0OO.append(", actionLabel=");
        sbOooO0OO.append(oooO00o.f98417OooO0Oo);
        c20358OooO00o.OooO00o(sbOooO0OO.toString(), new Object[0]);
        C33781o00o0O c33781o00o0O = c23028OooO0Oo2.f71010OooOO0;
        do {
            value = c33781o00o0O.getValue();
            c19176OooO0Oo = (C19176OooO0Oo) value;
            title = material2.getTitle();
            description = material2.getDescription();
            C32443OooOOO c32443OooOOO2 = (C32443OooOOO) OooOo.OoooO00(0, arrayList);
            str = (c32443OooOOO2 == null || (str11 = (String) c32443OooOOO2.f116638OooOo0o) == null) ? "" : str11;
            C32443OooOOO c32443OooOOO3 = (C32443OooOOO) OooOo.OoooO00(0, arrayList);
            str2 = (c32443OooOOO3 == null || (str10 = (String) c32443OooOOO3.f116637OooOo) == null) ? "" : str10;
            C32443OooOOO c32443OooOOO4 = (C32443OooOOO) OooOo.OoooO00(1, arrayList);
            str3 = (c32443OooOOO4 == null || (str9 = (String) c32443OooOOO4.f116638OooOo0o) == null) ? "" : str9;
            C32443OooOOO c32443OooOOO5 = (C32443OooOOO) OooOo.OoooO00(1, arrayList);
            str4 = (c32443OooOOO5 == null || (str8 = (String) c32443OooOOO5.f116637OooOo) == null) ? "" : str8;
            C32443OooOOO c32443OooOOO6 = (C32443OooOOO) OooOo.OoooO00(2, arrayList);
            str5 = (c32443OooOOO6 == null || (str7 = (String) c32443OooOOO6.f116638OooOo0o) == null) ? "" : str7;
            c32443OooOOO = (C32443OooOOO) OooOo.OoooO00(2, arrayList);
        } while (!c33781o00o0O.OooO(value, C19176OooO0Oo.OooO00o(c19176OooO0Oo, false, null, list, title, description, str, str2, str3, str4, str5, (c32443OooOOO == null || (str6 = (String) c32443OooOOO.f116637OooOo) == null) ? "" : str6, material2.getCreator().getId(), material2.getCreator().getName(), material2.getCreator().getDescription(), oooO00o.f98416OooO0OO, oooO00o.f98417OooO0Oo, oooO00o.f98415OooO0O0, null, 131072)));
        return C32460OooOooO.f116667OooO00o;
    }

    public final void OooO0o(String str) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
        c20358OooO00o.OooO00o("loadMaterial called with id: ".concat(str), new Object[0]);
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C23029OooO0o0(str, null), 3);
    }
}
