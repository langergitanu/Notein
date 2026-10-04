package o0Ooo0oo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.List;
import java.util.Set;
import o00O0oo0.C24969OooOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28291OooO0OO;
import o0o00Oo.C29901OooO0oo;

/* JADX INFO: renamed from: o0Ooo0oo.o00Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29554o00Oo0 extends AbstractC22050OooOo0o<PenVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28291OooO0OO f104839OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0oo.o00Oo0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<PenVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f104840OooO00o = new OooO00o();

        public static boolean OooO0Oo(Bundle bundle, Bundle bundle2) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Set<String> setKeySet2 = bundle2.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet2, "keySet(...)");
            if (!setKeySet.containsAll(setKeySet2)) {
                return false;
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                    if (!OooO0Oo((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PenVO penVO, PenVO penVO2) {
            return penVO.equals(penVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PenVO penVO, PenVO penVO2) {
            return penVO.getType() == penVO2.getType();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(PenVO penVO, PenVO penVO2) {
            PenVO penVO3 = penVO;
            PenVO penVO4 = penVO2;
            Bundle bundle = new Bundle();
            if (penVO3.getSelected() != penVO4.getSelected()) {
                bundle.putBoolean("isSelected", true);
            }
            if (penVO3.getColor() != penVO4.getColor()) {
                bundle.putBoolean("color", true);
            }
            Bundle extra = penVO3.getExtra();
            Bundle extra2 = penVO4.getExtra();
            f104840OooO00o.getClass();
            if (!OooO0Oo(extra, extra2)) {
                bundle.putBoolean("extra", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oo.o00Oo0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f104841OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f104842OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f104843OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f104841OooO00o = (ImageView) view.findViewById(R.id.iv_pen);
            this.f104842OooO0O0 = (ImageView) view.findViewById(R.id.iv_pen_color);
            this.f104843OooO0OO = (ImageView) view.findViewById(R.id.icon_tape_tint);
        }

        public final void OooO00o(PenVO penVO, Bundle bundle) {
            this.itemView.setTag(penVO);
            ImageView imageView = this.f104841OooO00o;
            C29554o00Oo0 c29554o00Oo0 = C29554o00Oo0.this;
            if (bundle == null) {
                this.itemView.setSelected(penVO.getSelected());
                imageView.setImageResource(c29554o00Oo0.OooO0o(penVO));
                OooO0O0(penVO);
                return;
            }
            if (bundle.isEmpty()) {
                this.itemView.setSelected(penVO.getSelected());
                imageView.setImageResource(c29554o00Oo0.OooO0o(penVO));
                OooO0O0(penVO);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 94842723) {
                        if (iHashCode != 96965648) {
                            if (iHashCode == 398301669 && str.equals("isSelected")) {
                                this.itemView.setSelected(penVO.getSelected());
                            }
                        } else if (str.equals("extra")) {
                            OooO0O0(penVO);
                        }
                    } else if (str.equals("color")) {
                        OooO0O0(penVO);
                    }
                }
            }
        }

        public final void OooO0O0(PenVO penVO) {
            int iOooO0oO = C29554o00Oo0.this.OooO0oO(penVO);
            ImageView imageView = this.f104842OooO0O0;
            imageView.setImageResource(iOooO0oO);
            if (penVO.getType() != 3 && penVO.getType() != 4 && penVO.getType() != 11) {
                imageView.getDrawable().setTint(C24969OooOO0.OooO0OO(penVO.getColor()));
            }
            ImageView tapePenTintView = this.f104843OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(tapePenTintView, "tapePenTintView");
            tapePenTintView.setVisibility(penVO.getType() == 11 ? 0 : 8);
            if (penVO.getType() == 11) {
                tapePenTintView.getDrawable().setTint(C24969OooOO0.OooO0OO(penVO.getColor()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int OooO0o(PenVO penVO) {
        switch (penVO.getType()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                Integer num = (Integer) C29901OooO0oo.f106078OooO0Oo.get(Integer.valueOf(penVO.getType()));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            case 5:
            case 6:
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int OooO0oO(PenVO penVO) {
        int type = penVO.getType();
        if (type != 0 && type != 1 && type != 2) {
            switch (type) {
                case 7:
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(penVO.getExtra().getString(C18437z2.f56754h), "line")) {
                        return R.drawable.ic_ni_toolbox_laser_line_pen_color;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(penVO.getExtra().getString(C18437z2.f56754h), "spot")) {
                        return R.drawable.ic_ni_toolbox_laser_spot_pen_color;
                    }
                    throw new IllegalArgumentException("unknown laser pen type");
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    return 0;
            }
        }
        Integer num = (Integer) C29901OooO0oo.f106079OooO0o0.get(Integer.valueOf(penVO.getType()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PenVO penVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penVOOooO0OO, "getItem(...)");
        holder.OooO00o(penVOOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pen_bar_pen, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewInflate);
        C28050OooO0OO.OooO00o(viewInflate, 1000L, new o0OoO000.oo0o0Oo(this, 2));
        return new OooO0O0(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        PenVO penVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penVOOooO0OO, "getItem(...)");
        holder.OooO00o(penVOOooO0OO, (Bundle) obj);
    }
}
