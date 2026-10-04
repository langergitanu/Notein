package o0oo0OO0;

import androidx.ink.strokes.C21970OooO0oo;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import com.orion.penkit.models.InkStrokeInfo;
import io.ktor.utils.p616io.Oooo000;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24457OooOOo;
import o000OO00.C24478Oooo00o;
import o000OO00.C24485OoooO;
import o000OO00.OooO0O0;
import o000OO0o.C24495OooO00o;
import o0oo0OoO.C31269OooO0O0;
import o0oo0Ooo.C31278OooO00o;
import o0oo0Ooo.EnumC31282OooO0o0;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo00O0O.C34467OooOo0;
import oOo00O0O.OooOo00;

/* JADX INFO: renamed from: o0oo0OO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31228OooO0O0 implements InterfaceC31229OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f111354OooO00o = C34467OooOo0.OooO00o(new com.orion.notein.domain.mapper.OooO00o(3));

    @Override // o0oo0OO0.InterfaceC31229OooO0OO
    public final boolean canDeserialize(String str) {
        CharSequence charSequenceSubSequence;
        if (str.length() > 0) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!Oooo000.OooO0o0(str.charAt(i))) {
                    charSequenceSubSequence = str.subSequence(i, str.length());
                    break;
                }
                i++;
            }
            if (C33599OooOo0O.OoooOOo(charSequenceSubSequence.toString(), '{')) {
                return true;
            }
        }
        return false;
    }

    @Override // o0oo0OO0.InterfaceC31229OooO0OO
    public final InkStrokeInfo deserialize(String str) {
        C24457OooOOo c24457OooOOoOooO0O0;
        Float f;
        Float f2;
        OooOo00 oooOo00 = this.f111354OooO00o;
        oooOo00.getClass();
        C31232OooO0o0 c31232OooO0o0 = (C31232OooO0o0) oooOo00.OooO0O0(str, C31232OooO0o0.Companion.serializer());
        Map<String, Float> map = c31232OooO0o0.f111379OooO0oO;
        C31231OooO0o c31231OooO0o = c31232OooO0o0.f111374OooO0O0;
        C31234OooO0oo c31234OooO0oo = c31231OooO0o.f111369OooO00o;
        int iOrdinal = c31234OooO0oo.f111390OooO00o.ordinal();
        C24478Oooo00o c24478Oooo00o = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? C24478Oooo00o.f82772OooO0Oo : C24478Oooo00o.f82774OooO0o0 : C24478Oooo00o.f82773OooO0o : C24478Oooo00o.f82775OooO0oO;
        C21970OooO0oo c21970OooO0oo = new C21970OooO0oo();
        for (C31233OooO0oO c31233OooO0oO : c31234OooO0oo.f111392OooO0OO) {
            c21970OooO0oo.OooO0oO(c31233OooO0oO.f111381OooO00o, c31233OooO0oO.f111382OooO0O0, c31233OooO0oO.f111387OooO0oO, c31233OooO0oO.f111384OooO0Oo, c31233OooO0oO.f111386OooO0o0, c31233OooO0oO.f111385OooO0o, (long) c31233OooO0oO.f111383OooO0OO, c24478Oooo00o);
        }
        C31230OooO0Oo c31230OooO0Oo = c31231OooO0o.f111370OooO0O0;
        try {
            String str2 = c31230OooO0Oo.f111367OooO0o0;
            if (OooOOO0.OooO0O0(str2, "pencil-unstable")) {
                c24457OooOOoOooO0O0 = BrushFamilyProvider.INSTANCE.getBrushFamily("notein-pencil-v1");
            } else if (BrushFamilyProvider.InkBrushFamilyId.INSTANCE.isFountain(str2)) {
                float fOooO0o0 = 1.0f;
                float fOooO0o02 = (map == null || (f2 = map.get("pressure_correct")) == null) ? 1.0f : OooOO0.OooO0o0(f2.floatValue(), 0.0f, 2.0f);
                if (map != null && (f = map.get("speed_correct")) != null) {
                    fOooO0o0 = OooOO0.OooO0o0(f.floatValue(), 0.0f, 1.0f);
                }
                c24457OooOOoOooO0O0 = C31278OooO00o.f111677OooO00o.OooO00o(fOooO0o02, fOooO0o0, OooOOO0.OooO0O0(str2, "notein-fountain-v1") ? EnumC31282OooO0o0.f111693OooOo : EnumC31282OooO0o0.f111695OooOoO0);
            } else {
                c24457OooOOoOooO0O0 = OooOOO0.OooO0O0(str2, "notein-ballpoint-v1") ? C31269OooO0O0.f111653OooO00o.OooO00o() : BrushFamilyProvider.INSTANCE.getBrushFamily(c31230OooO0Oo.f111367OooO0o0);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("InkStrokeJsonSerializer");
            c20358OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to get brush family: ", c31230OooO0Oo.f111367OooO0o0), new Object[0]);
            c24457OooOOoOooO0O0 = C24485OoooO.OooO0O0();
        }
        C24457OooOOo family = c24457OooOOoOooO0O0;
        OooO0O0.OooO00o oooO00o = o000OO00.OooO0O0.f82629OooO0Oo;
        long j = c31230OooO0Oo.f111364OooO0O0;
        oooO00o.getClass();
        OooOOO0.OooO0oO(family, "family");
        int i = C24495OooO00o.f82815OooO0Oo;
        return new InkStrokeInfo(c31232OooO0o0.f111373OooO00o, new androidx.ink.strokes.OooOOO0(new o000OO00.OooO0O0(c31230OooO0Oo.f111363OooO00o, c31230OooO0Oo.f111365OooO0OO, j, family), c21970OooO0oo), c31232OooO0o0.f111375OooO0OO, c31232OooO0o0.f111376OooO0Oo, c31232OooO0o0.f111378OooO0o0, c31232OooO0o0.f111377OooO0o, map);
    }
}
