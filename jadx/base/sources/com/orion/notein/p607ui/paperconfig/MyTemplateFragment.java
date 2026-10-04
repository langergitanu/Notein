package com.orion.notein.p607ui.paperconfig;

import OooO0oO.C20439OooO0oo;
import OooO0oO.C20440OooOO0;
import Oooo0.o000000O;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.C21714Oooo00O;
import androidx.core.view.C21715Oooo00o;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.ink.strokes.OooO;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.button.SelectableTextButtonView;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookVariantFile;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateVariantFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.popup.ThemeActionsBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.components.PaperConfigPreview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0O0oooO.o0OoOo0;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28153OooO0o0;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oo0o0o.OooOo00;
import o0Oo0ooO.ViewOnClickListenerC28438Oooo0;
import o0OoO0oO.C28675OooO0Oo;
import o0OoO0oO.ViewOnClickListenerC28671OooO;
import o0OoO0oO.ViewOnClickListenerC28677OooO0o0;
import o0OoO0oo.C28686OooO0O0;
import o0OoO0oo.C28691OooO0oO;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import o0OoOO.C28985OooO00o;
import o0OoOO.C28986OooO0O0;
import o0OoOO.C28987OooO0OO;
import o0OoOO00.ViewOnClickListenerC29029OoooO00;
import o0o000oo.C29811OooOO0o;
import o0o0OOO.C30465OooO0oo;
import o0o0OOO.C30470OooOOO0;
import o0o0OOO.C30471OooOOOO;
import o0o0OOO.C30477OooOo0;
import o0o0OOO.C30482OooOoO0;
import o0o0OOO.C30487OooOoOO;
import o0o0OOO.C30489OooOoo0;
import o0o0OOO.C30520o000000o;
import o0o0OOOo.EnumC30545OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/paperconfig/MyTemplateFragment;", "Lcom/orion/notein/ui/paperconfig/PaperConfigTemplateFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MyTemplateFragment extends PaperConfigTemplateFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PaperConfigPreview f78612OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RecyclerView f78613OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f78614OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public RecyclerView f78615OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C30465OooO0oo f78616OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C30465OooO0oo f78617OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C30465OooO0oo f78618OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C28985OooO00o f78619OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RecyclerView f78620Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public SelectableTextButtonView f78621Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C28987OooO0OO f78622Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ViewGroup f78623Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public SelectableTextButtonView f78624Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public SelectableTextButtonView f78625Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public SelectableTextButtonView f78626Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewGroup f78627Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public SelectableTextButtonView f78628Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public SelectableSymbolButtonView f78629Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public SelectableSymbolButtonView f78630Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public SelectableSymbolButtonView f78631OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ViewGroup f78632OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public SelectableSymbolButtonView f78634OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RecyclerView f78635OoooOO0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Uri f78637OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f78638OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Uri> f78639OoooOoO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C28675OooO0Oo f78633OoooO00 = new C28675OooO0Oo();

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C28675OooO0Oo f78640o000oOoO = new C28675OooO0Oo();

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO00o f78636OoooOOO = OooO00o.f78642OooOo0o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f78641OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f78642OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f78643OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f78644OooOoO0;

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
                com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o r0 = new com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o.f78642OooOo0o = r0
                com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o r1 = new com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o
                java.lang.String r2 = "MATERIAL_TEMPLATES"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o.f78641OooOo = r1
                com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o r2 = new com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o
                java.lang.String r3 = "TEMPLATE_BOOKS"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o.f78644OooOoO0 = r2
                com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO00o[] r0 = new com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o[]{r0, r1, r2}
                com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o.f78643OooOoO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.paperconfig.MyTemplateFragment.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f78643OooOoO.clone();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$cameraLauncher$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {129}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78646OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f78647OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Uri uri, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f78647OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MyTemplateFragment.this.new OooO0O0(this.f78647OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78646OooOo0o;
            MyTemplateFragment myTemplateFragment = MyTemplateFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Context contextRequireContext = myTemplateFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                this.f78646OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28691OooO0oO(contextRequireContext, this.f78647OooOoO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            String str = (String) obj;
            if (str != null) {
                myTemplateFragment.OooOooo().OooOOOo(str);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$handleStarClick$1$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {663}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78649OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PaperTheme f78650OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(PaperTheme paperTheme, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f78650OooOoO0 = paperTheme;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MyTemplateFragment.this.new OooO0OO(this.f78650OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOooOOoo;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78649OooOo0o;
            MyTemplateFragment myTemplateFragment = MyTemplateFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30520o000000o c30520o000000oOooOooo = myTemplateFragment.OooOooo();
                this.f78649OooOo0o = 1;
                objOooOOoo = c30520o000000oOooOooo.OooOOoo(this.f78650OooOoO0, this);
                if (objOooOOoo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooOOoo = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("MyTemplateFragment");
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("handleStarClick: result=", C32445OooOOOO.OooO0O0(objOooOOoo)), new Object[0]);
            if (!(objOooOOoo instanceof C32445OooOOOO.OooO00o)) {
                Context context = myTemplateFragment.getContext();
                if (context != null) {
                    String string = myTemplateFragment.getString(R.string.note_creation_save_scratch_theme);
                    OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.paperconfig.MyTemplateFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.MyTemplateFragment$pictureLauncher$1$1", m80623f = "MyTemplateFragment.kt", m80624l = {110}, m80625m = "invokeSuspend")
    public static final class C23760OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78652OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f78653OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23760OooO0Oo(Uri uri, Continuation<? super C23760OooO0Oo> continuation) {
            super(2, continuation);
            this.f78653OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MyTemplateFragment.this.new C23760OooO0Oo(this.f78653OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23760OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78652OooOo0o;
            MyTemplateFragment myTemplateFragment = MyTemplateFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Context contextRequireContext = myTemplateFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                this.f78652OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28691OooO0oO(contextRequireContext, this.f78653OooOoO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            String str = (String) obj;
            if (str != null) {
                myTemplateFragment.OooOooo().OooOOOo(str);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public MyTemplateFragment() {
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new androidx.ink.storage.OooO0O0(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f78638OoooOo0 = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Uri> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20440OooOO0(), new C29811OooOO0o(this, 1));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f78639OoooOoO = oooO0O0RegisterForActivityResult2;
    }

    public static String Oooo00O(int i) {
        return String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    public static String Oooo0OO(String str) {
        String string = C33599OooOo0O.Oooooo0(str).toString();
        if (string.length() == 0) {
            return string;
        }
        if (C33595OooOOo.OooOoO0(string, "#", false)) {
            string = string.substring(1);
            OooOOO0.OooO0o(string, "substring(...)");
        }
        if (string.length() == 6) {
            string = "ff".concat(string);
        }
        Locale US = Locale.US;
        OooOOO0.OooO0o(US, "US");
        String lowerCase = string.toLowerCase(US);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        return "#".concat(lowerCase);
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoO() {
        SelectableTextButtonView selectableTextButtonView = this.f78625Oooo0O0;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnAfterPage");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoOO() {
        SelectableTextButtonView selectableTextButtonView = this.f78624Oooo00o;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnAtTop");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoo() {
        SelectableTextButtonView selectableTextButtonView = this.f78626Oooo0OO;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnChangeAll");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOoo0() {
        SelectableTextButtonView selectableTextButtonView = this.f78621Oooo0;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnBeforePage");
        throw null;
    }

    @Override // com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment
    public final SelectableTextButtonView OooOooO() {
        SelectableTextButtonView selectableTextButtonView = this.f78628Oooo0o0;
        if (selectableTextButtonView == null) {
            return null;
        }
        if (selectableTextButtonView != null) {
            return selectableTextButtonView;
        }
        OooOOO0.OooOOOO("_btnChangeCurrent");
        throw null;
    }

    public final void Oooo0(ThemeVO themeVO) {
        String myTemplateId = themeVO.getMyTemplateId();
        if (myTemplateId != null) {
            if (themeVO.getPaperTheme() instanceof TemplateMaterialPaperTheme) {
                PaperTheme paperTheme = themeVO.getPaperTheme();
                OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme");
                TemplateMaterialPaperTheme templateMaterialPaperTheme = (TemplateMaterialPaperTheme) paperTheme;
                OooOooo().OooOoOO(myTemplateId, templateMaterialPaperTheme.getSelectedOrientation(), templateMaterialPaperTheme.getSelectedColor());
                Oooo0oO(myTemplateId, templateMaterialPaperTheme);
            } else {
                OooOooo().OooOOOO();
            }
            OooOooo().OooOo0o(myTemplateId);
        }
    }

    public final void Oooo00o(ThemeVO themeVO) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MyTemplateFragment");
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        c20358OooO00o.OooO00o("handleStarClick: vo=" + themeVO.getName(contextRequireContext) + ", paperTheme=" + themeVO.getPaperTheme(), new Object[0]);
        OooOoO0(21, new OooO(1, themeVO, this));
    }

    public final void Oooo0O0() {
        this.f78636OoooOOO = OooO00o.f78642OooOo0o;
        ViewGroup viewGroup = this.f78627Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("variantSelectorContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f78632OoooO0;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("variantSelectorContainerBooks");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0o(String str, TemplateBookPaperTheme templateBookPaperTheme) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MyTemplateFragment");
        String materialId = templateBookPaperTheme.getMaterialId();
        Orientation selectedOrientation = templateBookPaperTheme.getSelectedOrientation();
        String selectedColor = templateBookPaperTheme.getSelectedColor();
        int size = templateBookPaperTheme.getVariantFiles().size();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("showVariantSelectorForBook: templateId=", str, ", materialId=", materialId, ", selectedOrientation=");
        sbOooO0O0.append(selectedOrientation);
        sbOooO0O0.append(", selectedColor=");
        sbOooO0O0.append(selectedColor);
        sbOooO0O0.append(", variants=");
        sbOooO0O0.append(size);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        this.f78636OoooOOO = OooO00o.f78644OooOoO0;
        ViewGroup viewGroup = this.f78627Oooo0o;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("variantSelectorContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        List<Orientation> availableOrientations = templateBookPaperTheme.getAvailableOrientations();
        List<C32443OooOOO<String, String>> availableColors = templateBookPaperTheme.getAvailableColors();
        Orientation selectedOrientation2 = (Orientation) OooOooo().f109035Oooo0oO.getValue();
        if (selectedOrientation2 == null) {
            selectedOrientation2 = templateBookPaperTheme.getSelectedOrientation();
        }
        String selectedColor2 = (String) OooOooo().f109026Oooo.getValue();
        if (selectedColor2 == null) {
            selectedColor2 = templateBookPaperTheme.getSelectedColor();
        }
        List<TemplateBookVariantFile> variantFiles = templateBookPaperTheme.getVariantFiles();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(variantFiles, 10));
        for (TemplateBookVariantFile templateBookVariantFile : variantFiles) {
            arrayList.add(new C32449OooOOoo(templateBookVariantFile.getOrientation(), templateBookVariantFile.getColor(), templateBookVariantFile.getColorName()));
        }
        ViewGroup viewGroup2 = this.f78632OoooO0;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("variantSelectorContainerBooks");
            throw null;
        }
        viewGroup2.setVisibility(0);
        boolean zContains = availableOrientations.contains(Orientation.PORTRAIT);
        boolean zContains2 = availableOrientations.contains(Orientation.LANDSCAPE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Orientation orientation = (Orientation) ((C32449OooOOoo) obj).f116648OooOo0o;
            Object obj2 = linkedHashMap.get(orientation);
            if (obj2 == null) {
                ArrayList arrayList2 = new ArrayList();
                linkedHashMap.put(orientation, arrayList2);
                obj2 = arrayList2;
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((C32449OooOOoo) it.next()).f116647OooOo);
            }
            linkedHashMap2.put(key, OooOo.Oooo0(arrayList3));
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o("variant options (books): orientations=" + availableOrientations + ", colorsByOrientation=" + linkedHashMap2, new Object[0]);
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("variant files (books): ", OooOo.o000oOoO(arrayList, null, null, null, new C28686OooO0O0(1), 31)), new Object[0]);
        SelectableSymbolButtonView selectableSymbolButtonView = this.f78634OoooO0O;
        if (selectableSymbolButtonView == null) {
            OooOOO0.OooOOOO("btnPortraitVariantBooks");
            throw null;
        }
        selectableSymbolButtonView.setVisibility(zContains ? 0 : 8);
        SelectableSymbolButtonView selectableSymbolButtonView2 = this.f78631OoooO;
        if (selectableSymbolButtonView2 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariantBooks");
            throw null;
        }
        selectableSymbolButtonView2.setVisibility(zContains2 ? 0 : 8);
        SelectableSymbolButtonView selectableSymbolButtonView3 = this.f78634OoooO0O;
        if (selectableSymbolButtonView3 == null) {
            OooOOO0.OooOOOO("btnPortraitVariantBooks");
            throw null;
        }
        selectableSymbolButtonView3.setSelected(selectedOrientation2 == Orientation.PORTRAIT);
        SelectableSymbolButtonView selectableSymbolButtonView4 = this.f78631OoooO;
        if (selectableSymbolButtonView4 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariantBooks");
            throw null;
        }
        selectableSymbolButtonView4.setSelected(selectedOrientation2 == Orientation.LANDSCAPE);
        List listO00O0O = OooOo.o00O0O(availableColors, new C30489OooOoo0(this));
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o("availableColors (books): size=" + listO00O0O.size() + ", values=" + listO00O0O, new Object[0]);
        String strOooo0OO = Oooo0OO(selectedColor2);
        List list = listO00O0O;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((C32443OooOOO) it2.next()).f116638OooOo0o;
            arrayList4.add(new PageColorThemeVO(Color.parseColor(str2), OooOOO0.OooO0O0(Oooo0OO(str2), strOooo0OO), false, false, false, 28, null));
        }
        this.f78640o000oOoO.OooO0Oo(arrayList4);
    }

    public final void Oooo0o0(View view, ThemeVO vo, boolean z) {
        View viewFindViewById;
        view.setTag(vo);
        C28987OooO0OO c28987OooO0OO = this.f78622Oooo000;
        if (c28987OooO0OO == null) {
            OooOOO0.OooOOOO("themeMoreMenu");
            throw null;
        }
        synchronized (c28987OooO0OO) {
            try {
                OooOOO0.OooO0oO(vo, "vo");
                Context context = view.getContext();
                OooOOO0.OooO0o(context, "getContext(...)");
                if (C28038OooO0Oo.OooO0O0(context)) {
                    FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
                    OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                    ThemeActionsBottomSheetDialog themeActionsBottomSheetDialog = new ThemeActionsBottomSheetDialog();
                    themeActionsBottomSheetDialog.f73974OooOoO0 = c28987OooO0OO.f102724OooO0O0;
                    themeActionsBottomSheetDialog.f73973OooOoO = vo;
                    themeActionsBottomSheetDialog.f73975OooOoOO = z;
                    c28987OooO0OO.f102725OooO0OO = themeActionsBottomSheetDialog;
                    themeActionsBottomSheetDialog.show(childFragmentManager, "ThemeActionsBottomSheetDialog");
                } else {
                    if (!c28987OooO0OO.f102727OooO0o) {
                        c28987OooO0OO.OooO00o();
                    }
                    C28986OooO0O0 c28986OooO0O0 = c28987OooO0OO.f102728OooO0o0;
                    if (c28986OooO0O0 != null) {
                        Iterator it = c28986OooO0O0.f102722OooO0Oo.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setTag(vo);
                        }
                    }
                    C28986OooO0O0 c28986OooO0O02 = c28987OooO0OO.f102728OooO0o0;
                    if (c28986OooO0O02 != null && (viewFindViewById = c28986OooO0O02.f102719OooO00o.findViewById(R.id.item_rename)) != null) {
                        viewFindViewById.setVisibility(z ? 0 : 8);
                    }
                    if (view.getId() == R.id.more) {
                        Object parent = view.getParent();
                        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                        View viewFindViewById2 = ((View) parent).findViewById(R.id.cover_wrapper);
                        Rect rect = new Rect();
                        viewFindViewById2.getGlobalVisibleRect(rect);
                        Rect rect2 = new Rect();
                        view.getGlobalVisibleRect(rect2);
                        PopupWindow popupWindow = c28987OooO0OO.f102726OooO0Oo;
                        if (popupWindow == null) {
                            OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        popupWindow.showAtLocation(view, 0, rect.right + o000000O.OooO0o(6), rect2.bottom - o000000O.OooO0o(20));
                    } else {
                        Rect rect3 = new Rect();
                        view.getGlobalVisibleRect(rect3);
                        PopupWindow popupWindow2 = c28987OooO0OO.f102726OooO0Oo;
                        if (popupWindow2 == null) {
                            OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        popupWindow2.showAtLocation(view, 0, rect3.centerX(), rect3.centerY());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0oO(String str, TemplateMaterialPaperTheme templateMaterialPaperTheme) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MyTemplateFragment");
        String materialId = templateMaterialPaperTheme.getMaterialId();
        Orientation selectedOrientation = templateMaterialPaperTheme.getSelectedOrientation();
        String selectedColor = templateMaterialPaperTheme.getSelectedColor();
        int size = templateMaterialPaperTheme.getVariantFiles().size();
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("showVariantSelectorForMaterial: templateId=", str, ", materialId=", materialId, ", selectedOrientation=");
        sbOooO0O0.append(selectedOrientation);
        sbOooO0O0.append(", selectedColor=");
        sbOooO0O0.append(selectedColor);
        sbOooO0O0.append(", variants=");
        sbOooO0O0.append(size);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        this.f78636OoooOOO = OooO00o.f78641OooOo;
        ViewGroup viewGroup = this.f78632OoooO0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("variantSelectorContainerBooks");
            throw null;
        }
        viewGroup.setVisibility(8);
        List<Orientation> availableOrientations = templateMaterialPaperTheme.getAvailableOrientations();
        List<C32443OooOOO<String, String>> availableColors = templateMaterialPaperTheme.getAvailableColors();
        Orientation selectedOrientation2 = (Orientation) OooOooo().f109035Oooo0oO.getValue();
        if (selectedOrientation2 == null) {
            selectedOrientation2 = templateMaterialPaperTheme.getSelectedOrientation();
        }
        String selectedColor2 = (String) OooOooo().f109026Oooo.getValue();
        if (selectedColor2 == null) {
            selectedColor2 = templateMaterialPaperTheme.getSelectedColor();
        }
        List<TemplateVariantFile> variantFiles = templateMaterialPaperTheme.getVariantFiles();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(variantFiles, 10));
        for (TemplateVariantFile templateVariantFile : variantFiles) {
            arrayList.add(new C32449OooOOoo(templateVariantFile.getOrientation(), templateVariantFile.getColor(), templateVariantFile.getColorName()));
        }
        ViewGroup viewGroup2 = this.f78627Oooo0o;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("variantSelectorContainer");
            throw null;
        }
        viewGroup2.setVisibility(0);
        boolean zContains = availableOrientations.contains(Orientation.PORTRAIT);
        boolean zContains2 = availableOrientations.contains(Orientation.LANDSCAPE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            Orientation orientation = (Orientation) ((C32449OooOOoo) obj).f116648OooOo0o;
            Object obj2 = linkedHashMap.get(orientation);
            if (obj2 == null) {
                ArrayList arrayList2 = new ArrayList();
                linkedHashMap.put(orientation, arrayList2);
                obj2 = arrayList2;
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((C32449OooOOoo) it.next()).f116647OooOo);
            }
            linkedHashMap2.put(key, OooOo.Oooo0(arrayList3));
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o("variant options: orientations=" + availableOrientations + ", colorsByOrientation=" + linkedHashMap2, new Object[0]);
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("variant files: ", OooOo.o000oOoO(arrayList, null, null, null, new C30477OooOo0(), 31)), new Object[0]);
        SelectableSymbolButtonView selectableSymbolButtonView = this.f78629Oooo0oO;
        if (selectableSymbolButtonView == null) {
            OooOOO0.OooOOOO("btnPortraitVariant");
            throw null;
        }
        selectableSymbolButtonView.setVisibility(zContains ? 0 : 8);
        SelectableSymbolButtonView selectableSymbolButtonView2 = this.f78630Oooo0oo;
        if (selectableSymbolButtonView2 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariant");
            throw null;
        }
        selectableSymbolButtonView2.setVisibility(zContains2 ? 0 : 8);
        SelectableSymbolButtonView selectableSymbolButtonView3 = this.f78629Oooo0oO;
        if (selectableSymbolButtonView3 == null) {
            OooOOO0.OooOOOO("btnPortraitVariant");
            throw null;
        }
        selectableSymbolButtonView3.setSelected(selectedOrientation2 == Orientation.PORTRAIT);
        SelectableSymbolButtonView selectableSymbolButtonView4 = this.f78630Oooo0oo;
        if (selectableSymbolButtonView4 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariant");
            throw null;
        }
        selectableSymbolButtonView4.setSelected(selectedOrientation2 == Orientation.LANDSCAPE);
        List listO00O0O = OooOo.o00O0O(availableColors, new C30487OooOoOO(this));
        c20358OooO00o2.OooOOO0("MyTemplateFragment");
        c20358OooO00o2.OooO00o("availableColors: size=" + listO00O0O.size() + ", values=" + listO00O0O, new Object[0]);
        String strOooo0OO = Oooo0OO(selectedColor2);
        List list = listO00O0O;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((C32443OooOOO) it2.next()).f116638OooOo0o;
            arrayList4.add(new PageColorThemeVO(Color.parseColor(str2), OooOOO0.OooO0O0(Oooo0OO(str2), strOooo0OO), false, false, false, 28, null));
        }
        this.f78633OoooO00.OooO0Oo(arrayList4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_my_template, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        Uri uri = this.f78637OoooOOo;
        if (uri != null) {
            outState.putParcelable("image_save_uri", uri);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.orion.notein.p607ui.paperconfig.OooO00o oooO00o;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        getParentFragmentManager().Oooooo0("pdf_page_selected", getViewLifecycleOwner(), new C21714Oooo00O(this, 4));
        getParentFragmentManager().Oooooo0("pdf_path_selected", getViewLifecycleOwner(), new C21715Oooo00o(this));
        if (bundle != null) {
            this.f78637OoooOOo = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("image_save_uri", Uri.class) : (Uri) bundle.getParcelable("image_save_uri");
        }
        this.f78612OooOo = (PaperConfigPreview) view.findViewById(R.id.paper_config_preview);
        this.f78614OooOoO0 = (RecyclerView) view.findViewById(R.id.rv_my_templates);
        this.f78613OooOoO = (RecyclerView) view.findViewById(R.id.rv_material_templates);
        PaperConfigPreview paperConfigPreview = this.f78612OooOo;
        if (paperConfigPreview == null) {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
        paperConfigPreview.setDisplayMode(EnumC30545OooO00o.f109260OooOo);
        PaperConfigPreview paperConfigPreview2 = this.f78612OooOo;
        if (paperConfigPreview2 == null) {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
        paperConfigPreview2.setMoreButtonVisible(false);
        PaperConfigPreview paperConfigPreview3 = this.f78612OooOo;
        if (paperConfigPreview3 == null) {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
        String string = getString(R.string.preview);
        OooOOO0.OooO0o(string, "getString(...)");
        paperConfigPreview3.setPaperTitle(string);
        this.f78623Oooo00O = (ViewGroup) view.findViewById(R.id.action_buttons_container);
        this.f78624Oooo00o = (SelectableTextButtonView) view.findViewById(R.id.btn_at_top);
        this.f78621Oooo0 = (SelectableTextButtonView) view.findViewById(R.id.btn_before_page);
        this.f78625Oooo0O0 = (SelectableTextButtonView) view.findViewById(R.id.btn_after_page);
        this.f78626Oooo0OO = (SelectableTextButtonView) view.findViewById(R.id.btn_change_all);
        this.f78628Oooo0o0 = (SelectableTextButtonView) view.findViewById(R.id.btn_change_current);
        Oooo000();
        SelectableTextButtonView selectableTextButtonViewOooOoo = OooOoo();
        if (selectableTextButtonViewOooOoo != null) {
            selectableTextButtonViewOooOoo.setOnClickListener(new o0OoOo0(this, 6));
        }
        SelectableTextButtonView selectableTextButtonViewOooOooO = OooOooO();
        if (selectableTextButtonViewOooOooO != null) {
            selectableTextButtonViewOooOooO.setOnClickListener(new OooOo00(this, 4));
        }
        Fragment parentFragment = getParentFragment();
        PaperConfigDialogFragment paperConfigDialogFragment = parentFragment instanceof PaperConfigDialogFragment ? (PaperConfigDialogFragment) parentFragment : null;
        if (paperConfigDialogFragment != null) {
            oooO00o = paperConfigDialogFragment.f78658Oooo000;
            if (oooO00o == null) {
                OooOOO0.OooOOOO("strategy");
                throw null;
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o != null) {
            boolean z = oooO00o.OooO0OO() || oooO00o.OooO0O0();
            ViewGroup viewGroup = this.f78623Oooo00O;
            if (viewGroup == null) {
                OooOOO0.OooOOOO("actionButtonsContainer");
                throw null;
            }
            viewGroup.setVisibility(z ? 0 : 8);
            boolean zOooO0OO = oooO00o.OooO0OO();
            SelectableTextButtonView selectableTextButtonView = this.f78624Oooo00o;
            if (selectableTextButtonView == null) {
                OooOOO0.OooOOOO("_btnAtTop");
                throw null;
            }
            selectableTextButtonView.setVisibility(zOooO0OO ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView2 = this.f78621Oooo0;
            if (selectableTextButtonView2 == null) {
                OooOOO0.OooOOOO("_btnBeforePage");
                throw null;
            }
            selectableTextButtonView2.setVisibility(zOooO0OO ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView3 = this.f78625Oooo0O0;
            if (selectableTextButtonView3 == null) {
                OooOOO0.OooOOOO("_btnAfterPage");
                throw null;
            }
            selectableTextButtonView3.setVisibility(zOooO0OO ? 0 : 8);
            boolean zOooO0O0 = oooO00o.OooO0O0();
            SelectableTextButtonView selectableTextButtonView4 = this.f78626Oooo0OO;
            if (selectableTextButtonView4 == null) {
                OooOOO0.OooOOOO("_btnChangeAll");
                throw null;
            }
            selectableTextButtonView4.setVisibility(zOooO0O0 ? 0 : 8);
            SelectableTextButtonView selectableTextButtonView5 = this.f78628Oooo0o0;
            if (selectableTextButtonView5 == null) {
                OooOOO0.OooOOOO("_btnChangeCurrent");
                throw null;
            }
            selectableTextButtonView5.setVisibility(zOooO0O0 ? 0 : 8);
        }
        this.f78617OooOoo0 = new C30465OooO0oo(true);
        RecyclerView recyclerView = this.f78614OooOoO0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvMyTemplates");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        C30465OooO0oo c30465OooO0oo = this.f78617OooOoo0;
        if (c30465OooO0oo == null) {
            OooOOO0.OooOOOO("myTemplateAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30465OooO0oo);
        C30465OooO0oo c30465OooO0oo2 = this.f78617OooOoo0;
        if (c30465OooO0oo2 == null) {
            OooOOO0.OooOOOO("myTemplateAdapter");
            throw null;
        }
        c30465OooO0oo2.f108791OooO0Oo = new ViewOnClickListenerC28155OooO0oo(this, 5);
        c30465OooO0oo2.f108793OooO0o0 = new C30470OooOOO0(this, 0);
        c30465OooO0oo2.f108792OooO0o = new InterfaceC32508OooOOOo() { // from class: o0o0OOO.OooOOO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                View view2 = (View) obj;
                ThemeVO vo = (ThemeVO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                this.f108809OooOo0o.Oooo0o0(view2, vo, true);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        c30465OooO0oo2.f108794OooO0oO = new C30471OooOOOO(this, 0);
        this.f78616OooOoo = new C30465OooO0oo(false);
        RecyclerView recyclerView2 = this.f78613OooOoO;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvMaterialTemplates");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        C30465OooO0oo c30465OooO0oo3 = this.f78616OooOoo;
        if (c30465OooO0oo3 == null) {
            OooOOO0.OooOOOO("materialTemplateAdapter");
            throw null;
        }
        recyclerView2.setAdapter(c30465OooO0oo3);
        C30465OooO0oo c30465OooO0oo4 = this.f78616OooOoo;
        if (c30465OooO0oo4 == null) {
            OooOOO0.OooOOOO("materialTemplateAdapter");
            throw null;
        }
        c30465OooO0oo4.f108791OooO0Oo = new ViewOnClickListenerC28671OooO(this, 3);
        c30465OooO0oo4.f108793OooO0o0 = new InterfaceC32507OooOO0o() { // from class: o0o0OOO.OooOOOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                ThemeVO vo = (ThemeVO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                this.f108814OooOo0o.Oooo00o(vo);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        c30465OooO0oo4.f108792OooO0o = new InterfaceC32508OooOOOo() { // from class: o0o0OOO.OooOOo0
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                View view2 = (View) obj;
                ThemeVO vo = (ThemeVO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                this.f108817OooOo0o.Oooo0o0(view2, vo, false);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        this.f78618OooOooO = new C30465OooO0oo(false);
        RecyclerView recyclerView3 = (RecyclerView) requireView().findViewById(R.id.rv_template_books);
        this.f78615OooOoOO = recyclerView3;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("rvTemplateBooks");
            throw null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        C30465OooO0oo c30465OooO0oo5 = this.f78618OooOooO;
        if (c30465OooO0oo5 == null) {
            OooOOO0.OooOOOO("templateBookAdapter");
            throw null;
        }
        recyclerView3.setAdapter(c30465OooO0oo5);
        C30465OooO0oo c30465OooO0oo6 = this.f78618OooOooO;
        if (c30465OooO0oo6 == null) {
            OooOOO0.OooOOOO("templateBookAdapter");
            throw null;
        }
        c30465OooO0oo6.f108791OooO0Oo = new ViewOnClickListenerC28702OooOOoo(this, 4);
        c30465OooO0oo6.f108793OooO0o0 = new InterfaceC32507OooOO0o() { // from class: o0o0OOO.OooOO0O
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                ThemeVO vo = (ThemeVO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                this.f108807OooOo0o.Oooo00o(vo);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        c30465OooO0oo6.f108792OooO0o = new InterfaceC32508OooOOOo() { // from class: o0o0OOO.OooOO0o
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                View view2 = (View) obj;
                ThemeVO vo = (ThemeVO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                this.f108808OooOo0o.Oooo0o0(view2, vo, false);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        this.f78627Oooo0o = (ViewGroup) view.findViewById(R.id.variant_selector_container);
        this.f78629Oooo0oO = (SelectableSymbolButtonView) view.findViewById(R.id.btn_portrait_variant);
        this.f78630Oooo0oo = (SelectableSymbolButtonView) view.findViewById(R.id.btn_landscape_variant);
        this.f78620Oooo = (RecyclerView) view.findViewById(R.id.rv_variant_colors);
        SelectableSymbolButtonView selectableSymbolButtonView = this.f78629Oooo0oO;
        if (selectableSymbolButtonView == null) {
            OooOOO0.OooOOOO("btnPortraitVariant");
            throw null;
        }
        selectableSymbolButtonView.setOnClickListener(new ViewOnClickListenerC29029OoooO00(this, 4));
        SelectableSymbolButtonView selectableSymbolButtonView2 = this.f78630Oooo0oo;
        if (selectableSymbolButtonView2 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariant");
            throw null;
        }
        selectableSymbolButtonView2.setOnClickListener(new ViewOnClickListenerC28438Oooo0(this, 3));
        RecyclerView recyclerView4 = this.f78620Oooo;
        if (recyclerView4 == null) {
            OooOOO0.OooOOOO("rvVariantColors");
            throw null;
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecyclerView recyclerView5 = this.f78620Oooo;
        if (recyclerView5 == null) {
            OooOOO0.OooOOOO("rvVariantColors");
            throw null;
        }
        C28675OooO0Oo c28675OooO0Oo = this.f78633OoooO00;
        recyclerView5.setAdapter(c28675OooO0Oo);
        c28675OooO0Oo.f101612OooO0O0 = new ViewOnClickListenerC28677OooO0o0(this, 2);
        this.f78632OoooO0 = (ViewGroup) view.findViewById(R.id.variant_selector_container_books);
        this.f78634OoooO0O = (SelectableSymbolButtonView) view.findViewById(R.id.btn_portrait_variant_books);
        this.f78631OoooO = (SelectableSymbolButtonView) view.findViewById(R.id.btn_landscape_variant_books);
        this.f78635OoooOO0 = (RecyclerView) view.findViewById(R.id.rv_variant_colors_books);
        SelectableSymbolButtonView selectableSymbolButtonView3 = this.f78634OoooO0O;
        if (selectableSymbolButtonView3 == null) {
            OooOOO0.OooOOOO("btnPortraitVariantBooks");
            throw null;
        }
        selectableSymbolButtonView3.setOnClickListener(new ViewOnClickListenerC28153OooO0o0(this, 2));
        SelectableSymbolButtonView selectableSymbolButtonView4 = this.f78631OoooO;
        if (selectableSymbolButtonView4 == null) {
            OooOOO0.OooOOOO("btnLandscapeVariantBooks");
            throw null;
        }
        selectableSymbolButtonView4.setOnClickListener(new ViewOnClickListenerC28152OooO0o(this, 3));
        RecyclerView recyclerView6 = this.f78635OoooOO0;
        if (recyclerView6 == null) {
            OooOOO0.OooOOOO("rvVariantColorsBooks");
            throw null;
        }
        recyclerView6.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecyclerView recyclerView7 = this.f78635OoooOO0;
        if (recyclerView7 == null) {
            OooOOO0.OooOOOO("rvVariantColorsBooks");
            throw null;
        }
        C28675OooO0Oo c28675OooO0Oo2 = this.f78640o000oOoO;
        recyclerView7.setAdapter(c28675OooO0Oo2);
        c28675OooO0Oo2.f101612OooO0O0 = new ViewOnClickListenerC28154OooO0oO(this, 3);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f78619OooOooo = new C28985OooO00o(contextRequireContext, new ViewOnClickListenerC28701OooOOo0(this, 3));
        Context contextRequireContext2 = requireContext();
        OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f78622Oooo000 = new C28987OooO0OO(contextRequireContext2, new ViewOnClickListenerC28700OooOOo(this, 2));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30482OooOoO0(this, null), 3);
    }
}
