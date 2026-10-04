package o0O0o0oo;

import android.graphics.Color;
import com.android.billingclient.api.C22192OoooOO0;
import com.google.gson.Gson;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import o0000oo0.C24356OooO0O0;
import oO00o0oo.C32394OooO00o;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oO0o.C32409OooO00o;
import oO00oO0o.C32410OooO0O0;
import oO00oO0o.C32411OooO0OO;
import oO00oO0o.C32412OooO0Oo;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;

/* JADX INFO: renamed from: o0O0o0oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26089OooOOoo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f89065OooO = C24340OooO0oo.OooO0o0("key_default_text_basic_style_vo");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static C24356OooO0O0<AbstractC24338OooO0o0> f89066OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Gson f89067OooO00o = new Gson();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public oOO00OOO.OooO0OO f89068OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TextBasicStyleVO f89069OooO0OO = new TextBasicStyleVO(Color.parseColor("#FFFEFCA4"), 0, false);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextBasicStyleVO f89070OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C26079OooO0oo f89071OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f89072OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<TextBasicStyleVO> f89073OooO0oO;

    public C26089OooOOoo(C26079OooO0oo c26079OooO0oo) {
        TextBasicStyleVO textBasicStyleVO = TextBasicStyleVO.EMPTY;
        this.f89070OooO0Oo = textBasicStyleVO;
        this.f89072OooO0o0 = new ArrayList();
        this.f89073OooO0oO = (List) Stream.of((Object[]) new TextBasicStyleVO[]{textBasicStyleVO, new TextBasicStyleVO(Color.parseColor("#FFFEFCA4"), 0, false), new TextBasicStyleVO(Color.parseColor("#FFDAF7F1"), 0, false), new TextBasicStyleVO(Color.parseColor("#FFCCE9FF"), 0, false), new TextBasicStyleVO(Color.parseColor("#FFE0D7FF"), 0, false), new TextBasicStyleVO(Color.parseColor("#FFF9D3D3"), 0, false), new TextBasicStyleVO(0, Color.parseColor("#FF3F52FF"), false), new TextBasicStyleVO(0, Color.parseColor("#FFE02020"), false), new TextBasicStyleVO(0, Color.parseColor("#FFFA6400"), false), new TextBasicStyleVO(0, Color.parseColor("#FFF7B500"), false), new TextBasicStyleVO(0, Color.parseColor("#FF44D7B6"), false), new TextBasicStyleVO(0, Color.parseColor("#FF0091FF"), false)}).collect(Collectors.toList());
        this.f89071OooO0o = c26079OooO0oo;
    }

    public final ArrayList OooO00o() {
        ArrayList arrayList;
        synchronized (this.f89072OooO0o0) {
            try {
                arrayList = new ArrayList();
                for (TextBasicStyleVO textBasicStyleVO : this.f89073OooO0oO) {
                    TextBasicStyleVO textBasicStyleVO2 = this.f89070OooO0Oo;
                    int i = textBasicStyleVO2.highlightColor;
                    int i2 = textBasicStyleVO.highlightColor;
                    boolean z = true;
                    boolean z2 = i == i2 && i2 != 0;
                    int i3 = textBasicStyleVO2.underlineColor;
                    int i4 = textBasicStyleVO.underlineColor;
                    if (i3 != i4 || i4 == 0) {
                        z = z2;
                    }
                    arrayList.add(new TextBasicStyleVO(textBasicStyleVO.highlightColor, textBasicStyleVO.underlineColor, z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void OooO0O0(int i, int i2, boolean z) {
        final TextBasicStyleVO textBasicStyleVO = new TextBasicStyleVO(i, i2);
        if (z) {
            C32409OooO00o c32409OooO00oOooO00o = f89066OooO0oo.OooO00o(new InterfaceC32403OooO0OO() { // from class: o0O0o0oo.OooOOOo
                @Override // oO00oO00.InterfaceC32403OooO0OO
                public final Object apply(Object obj) {
                    C26089OooOOoo c26089OooOOoo = this.f89062OooOo0o;
                    c26089OooOOoo.getClass();
                    C24334OooO0O0 c24334OooO0O0OooO0Oo = ((AbstractC24338OooO0o0) obj).OooO0Oo();
                    c24334OooO0O0OooO0Oo.OooO0oO(C26089OooOOoo.f89065OooO, c26089OooOOoo.f89067OooO00o.toJson(textBasicStyleVO));
                    return new C32410OooO0O0(c24334OooO0O0OooO0Oo);
                }
            });
            C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
            Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
            new C32411OooO0OO(new C32412OooO0Oo(c32409OooO00oOooO00o, c32416OooO0OO), C32394OooO00o.OooO00o()).OooO00o(new C22192OoooOO0(textBasicStyleVO));
        }
        this.f89070OooO0Oo = textBasicStyleVO;
    }
}
