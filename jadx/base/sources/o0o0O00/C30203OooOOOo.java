package o0o0O00;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.widget.Toast;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26353o0ooOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O00.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onCreateShortcut$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2, StyleIdentifier.GRID_TABLE_2_ACCENT_3}, m80625m = "invokeSuspend")
public final class C30203OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteVO f107568OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f107569OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30201OooOOO0 f107570OooOoO0;

    /* JADX INFO: renamed from: o0o0O00.OooOOOo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultNoteMoreActionListener$onCreateShortcut$1$1", m80623f = "DefaultNoteMoreActionListener.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30201OooOOO0 f107571OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f107572OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, C30201OooOOO0 c30201OooOOO0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107572OooOo0o = z;
            this.f107571OooOo = c30201OooOOO0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f107572OooOo0o, this.f107571OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            MainActivity mainActivity;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            boolean z = this.f107572OooOo0o;
            C30201OooOOO0 c30201OooOOO0 = this.f107571OooOo;
            if (z) {
                ActivityC21897OooOo0 activity = c30201OooOOO0.f107547OooO00o.getActivity();
                mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    Toast.makeText(mainActivity, mainActivity.getString(R.string.shortcut_request_sent), 0).show();
                }
            } else {
                ActivityC21897OooOo0 activity2 = c30201OooOOO0.f107547OooO00o.getActivity();
                mainActivity = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                if (mainActivity != null) {
                    o0oo000O.OooOOO.f111236OooO00o.getClass();
                    if (o0oo000O.OooOOO.OooO0O0(mainActivity)) {
                        Toast.makeText(mainActivity, mainActivity.getString(R.string.shortcut_create_failed), 0).show();
                    } else {
                        Toast.makeText(mainActivity, mainActivity.getString(R.string.shortcut_not_supported), 0).show();
                    }
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30203OooOOOo(NoteVO noteVO, Continuation continuation, C30201OooOOO0 c30201OooOOO0) {
        super(2, continuation);
        this.f107568OooOo = noteVO;
        this.f107570OooOoO0 = c30201OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30203OooOOOo(this.f107568OooOo, continuation, this.f107570OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30203OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f2, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        if (r14 == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r14, r1, r13) == r0) goto L39;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107569OooOo0o;
        C30201OooOOO0 c30201OooOOO0 = this.f107570OooOoO0;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            NoteVO noteVO = this.f107568OooOo;
            int type = noteVO.getType();
            if (type != 0) {
                zBooleanValue = false;
                if (type == 1) {
                    o0oo000O.OooOOO oooOOO = o0oo000O.OooOOO.f111236OooO00o;
                    Context contextRequireContext = c30201OooOOO0.f107547OooO00o.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    this.f107569OooOo0o = 2;
                    oooOOO.getClass();
                    if (o0oo000O.OooOOO.OooO0O0(contextRequireContext)) {
                        ShortcutManager shortcutManager = (ShortcutManager) contextRequireContext.getSystemService(ShortcutManager.class);
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                        intent.setData(C26353o0ooOO0.OooO00o("folder", new C32443OooOOO("id", noteVO.getId())));
                        intent.setPackage(contextRequireContext.getPackageName());
                        ShortcutInfo shortcutInfoBuild = new ShortcutInfo.Builder(contextRequireContext, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("folder_", noteVO.getId())).setShortLabel(o0oo000O.OooOOO.OooO0OO(noteVO.getName())).setLongLabel(noteVO.getName()).setIcon(Icon.createWithResource(contextRequireContext, R.mipmap.ic_folder_shortcut)).setIntent(intent).build();
                        kotlin.jvm.internal.OooOOO0.OooO0o(shortcutInfoBuild, "build(...)");
                        if (shortcutManager != null) {
                            try {
                                if (!shortcutManager.requestPinShortcut(shortcutInfoBuild, null)) {
                                }
                                zBooleanValue = z;
                            } catch (Exception e) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("ShortcutUtils");
                                c20358OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to create folder shortcut for ", noteVO.getName()), new Object[0]);
                            }
                            obj = Boolean.valueOf(zBooleanValue);
                        }
                        z = false;
                        zBooleanValue = z;
                        obj = Boolean.valueOf(zBooleanValue);
                    } else {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("ShortcutUtils");
                        c20358OooO00o2.OooOO0O("Device does not support shortcut creation", new Object[0]);
                        obj = Boolean.FALSE;
                    }
                }
            } else {
                o0oo000O.OooOOO oooOOO2 = o0oo000O.OooOOO.f111236OooO00o;
                Context contextRequireContext2 = c30201OooOOO0.f107547OooO00o.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                this.f107569OooOo0o = 1;
                obj = oooOOO2.OooO00o(contextRequireContext2, noteVO, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        OooO00o oooO00o = new OooO00o(zBooleanValue, c30201OooOOO0, null);
        this.f107569OooOo0o = 3;
    }
}
