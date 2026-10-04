package o0oo000O;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.text.BreakIterator;
import java.util.Locale;
import o0O0oooO.C26353o0ooOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f111236OooO00o = new OooOOO();

    public static boolean OooO0O0(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        return shortcutManager != null && shortcutManager.isRequestPinShortcutSupported();
    }

    public static String OooO0OO(String str) {
        int next;
        if (str.length() > 12) {
            try {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                characterInstance.setText(str);
                int iFirst = characterInstance.first();
                int i = 0;
                while (iFirst != -1 && i < 12 && (next = characterInstance.next()) != -1) {
                    i++;
                    iFirst = next;
                }
                if (iFirst != -1 && iFirst < str.length()) {
                    String strSubstring = str.substring(0, iFirst);
                    kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                    return strSubstring;
                }
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ShortcutUtils");
                c20358OooO00o.OooOO0o(e, "BreakIterator failed, using simple truncation", new Object[0]);
                return C33600OooOo0o.o0OoOo0(12, str);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Context context, NoteVO noteVO, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOO0 oooOOO0;
        ShortcutManager shortcutManager;
        Intent intent;
        Object objOooO0o;
        OooOOO oooOOO;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f111244OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f111244OooOooO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOO0.f111243OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f111244OooOooO;
        boolean z = false;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!OooO0O0(context)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("ShortcutUtils");
                c20358OooO00o.OooOO0O("Device does not support shortcut creation", new Object[0]);
                return Boolean.FALSE;
            }
            shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(C26353o0ooOO0.OooO00o(BackupFile.FILE_CONTENT_TYPE_NOTE, new C32443OooOOO("id", noteVO.getId())));
            intent.setPackage(context.getPackageName());
            String tnPath = noteVO.getTnPath();
            oooOOO0.f111238OooOo0o = this;
            oooOOO0.f111237OooOo = context;
            oooOOO0.f111240OooOoO0 = noteVO;
            oooOOO0.f111239OooOoO = shortcutManager;
            oooOOO0.f111241OooOoOO = intent;
            oooOOO0.f111244OooOooO = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C31191OooOO0o(tnPath, null), oooOOO0);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent2 = oooOOO0.f111241OooOoOO;
            ShortcutManager shortcutManager2 = oooOOO0.f111239OooOoO;
            NoteVO noteVO2 = oooOOO0.f111240OooOoO0;
            Context context2 = oooOOO0.f111237OooOo;
            OooOOO oooOOO2 = oooOOO0.f111238OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            intent = intent2;
            context = context2;
            shortcutManager = shortcutManager2;
            noteVO = noteVO2;
            oooOOO = oooOOO2;
            objOooO0o = obj;
        }
        Icon iconCreateWithResource = (Icon) objOooO0o;
        if (iconCreateWithResource == null) {
            iconCreateWithResource = Icon.createWithResource(context, R.mipmap.ic_logo_round);
            kotlin.jvm.internal.OooOOO0.OooO0o(iconCreateWithResource, "createWithResource(...)");
        }
        ShortcutInfo.Builder builder = new ShortcutInfo.Builder(context, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("note_", noteVO.getId()));
        String name = noteVO.getName();
        oooOOO.getClass();
        ShortcutInfo shortcutInfoBuild = builder.setShortLabel(OooO0OO(name)).setLongLabel(noteVO.getName()).setIcon(iconCreateWithResource).setIntent(intent).build();
        kotlin.jvm.internal.OooOOO0.OooO0o(shortcutInfoBuild, "build(...)");
        if (shortcutManager != null) {
            try {
                boolean z2 = shortcutManager.requestPinShortcut(shortcutInfoBuild, null);
                z = z2;
            } catch (Exception e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("ShortcutUtils");
                c20358OooO00o2.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to create note shortcut for ", noteVO.getName()), new Object[0]);
            }
        }
        return Boolean.valueOf(z);
    }
}
