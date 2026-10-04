package o0OoOo00;

import OooOoO.C20504OooO0O0;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0OoOo.C29196OooO0OO;
import o0OoOo0o.C29210OooO00o;
import o0ooOOoo.C31660OooO0o0;
import o0ooOOoo.InterfaceC31656OooO0O0;

/* JADX INFO: renamed from: o0OoOo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29200OooO00o extends AbstractC22050OooOo0o<C29196OooO0OO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C31660OooO0o0.OooO00o f103567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f103568OooO0OO;

    /* JADX INFO: renamed from: o0OoOo00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19964OooO00o extends OooOOO.AbstractC22036OooO0o0<C29196OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19964OooO00o f103569OooO00o = new C19964OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29196OooO0OO c29196OooO0OO, C29196OooO0OO c29196OooO0OO2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29196OooO0OO c29196OooO0OO, C29196OooO0OO c29196OooO0OO2) {
            return OooOOO0.OooO0O0(c29196OooO0OO.f103556OooO00o, c29196OooO0OO2.f103556OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C29196OooO0OO c29196OooO0OO, C29196OooO0OO c29196OooO0OO2) {
            C29196OooO0OO c29196OooO0OO3 = c29196OooO0OO;
            C29196OooO0OO c29196OooO0OO4 = c29196OooO0OO2;
            Bundle bundle = new Bundle();
            String str = c29196OooO0OO3.f103557OooO0O0;
            String str2 = c29196OooO0OO4.f103557OooO0O0;
            if (!OooOOO0.OooO0O0(str, str2)) {
                bundle.putString("name", str2);
            }
            long j = c29196OooO0OO3.f103558OooO0OO;
            long j2 = c29196OooO0OO4.f103558OooO0OO;
            if (j != j2) {
                bundle.putLong("duration", j2);
            }
            long j3 = c29196OooO0OO3.f103559OooO0Oo;
            long j4 = c29196OooO0OO4.f103559OooO0Oo;
            if (j3 != j4) {
                bundle.putLong("createAt", j4);
            }
            boolean z = c29196OooO0OO3.f103560OooO0o;
            boolean z2 = c29196OooO0OO4.f103560OooO0o;
            if (z != z2) {
                bundle.putBoolean("selected", z2);
            }
            boolean z3 = c29196OooO0OO3.f103561OooO0o0;
            boolean z4 = c29196OooO0OO4.f103561OooO0o0;
            if (z3 != z4) {
                bundle.putBoolean("isPlaying", z4);
            }
            boolean z5 = c29196OooO0OO3.f103562OooO0oO;
            boolean z6 = c29196OooO0OO4.f103562OooO0oO;
            if (z5 != z6) {
                bundle.putBoolean("isInSelectionMode", z6);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0OoOo00.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103570OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f103571OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f103572OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f103573OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImageView f103574OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f103575OooO0o0;

        public OooO0O0(final View view, final C29200OooO00o c29200OooO00o) {
            super(view);
            TextView name = (TextView) view.findViewById(R.id.audio_name);
            this.f103570OooO00o = name;
            this.f103571OooO0O0 = (TextView) view.findViewById(R.id.audio_duration);
            this.f103572OooO0OO = (TextView) view.findViewById(R.id.audio_created_at);
            ImageView btnPlay = (ImageView) view.findViewById(R.id.btn_play);
            this.f103573OooO0Oo = btnPlay;
            ImageView imageView = (ImageView) view.findViewById(R.id.drag_handle);
            this.f103575OooO0o0 = imageView;
            this.f103574OooO0o = (ImageView) view.findViewById(R.id.iv_selected);
            C28050OooO0OO.OooO00o(view, 500L, new View.OnClickListener() { // from class: o0OoOo00.OooO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object tag = view.getTag();
                    OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioFileVO");
                    C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) tag;
                    C31660OooO0o0.OooO00o oooO00o = c29200OooO00o.f103567OooO0O0;
                    if (oooO00o != null) {
                        oooO00o.OooO00o(c29196OooO0OO);
                    }
                }
            });
            OooOOO0.OooO0o(name, "name");
            C28050OooO0OO.OooO00o(name, 500L, new View.OnClickListener() { // from class: o0OoOo00.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC31656OooO0O0 interfaceC31656OooO0O0;
                    Object tag = view.getTag();
                    OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioFileVO");
                    C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) tag;
                    C29200OooO00o c29200OooO00o2 = c29200OooO00o;
                    if (!c29196OooO0OO.f103562OooO0oO) {
                        C31660OooO0o0.OooO00o oooO00o = c29200OooO00o2.f103567OooO0O0;
                        if (oooO00o != null) {
                            oooO00o.OooO00o(c29196OooO0OO);
                            return;
                        }
                        return;
                    }
                    C31660OooO0o0.OooO00o oooO00o2 = c29200OooO00o2.f103567OooO0O0;
                    if (oooO00o2 == null || (interfaceC31656OooO0O0 = C31660OooO0o0.this.f113165OooO0O0) == null) {
                        return;
                    }
                    interfaceC31656OooO0O0.OooO00o(c29196OooO0OO);
                }
            });
            OooOOO0.OooO0o(btnPlay, "btnPlay");
            C28050OooO0OO.OooO00o(btnPlay, 500L, new View.OnClickListener() { // from class: o0OoOo00.OooO0Oo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC31656OooO0O0 interfaceC31656OooO0O0;
                    Object tag = view.getTag();
                    OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.audio.vo.AudioFileVO");
                    C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) tag;
                    C31660OooO0o0.OooO00o oooO00o = c29200OooO00o.f103567OooO0O0;
                    if (oooO00o == null || (interfaceC31656OooO0O0 = C31660OooO0o0.this.f113165OooO0O0) == null) {
                        return;
                    }
                    interfaceC31656OooO0O0.OooO0o(c29196OooO0OO);
                }
            });
            imageView.setOnTouchListener(new ViewOnTouchListenerC29205OooO0o0(c29200OooO00o, 0));
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(C29196OooO0OO c29196OooO0OO, Bundle bundle) {
            this.itemView.setTag(c29196OooO0OO);
            TextView textView = this.f103572OooO0OO;
            long j = c29196OooO0OO.f103559OooO0Oo;
            TextView textView2 = this.f103570OooO00o;
            String str = c29196OooO0OO.f103557OooO0O0;
            if (bundle == null || bundle.isEmpty()) {
                textView2.setText(str);
                OooO0O0(c29196OooO0OO);
                textView.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Long.valueOf(j)));
                OooO0Oo(c29196OooO0OO);
                OooO0o0(c29196OooO0OO);
                OooO0OO(c29196OooO0OO);
                OooO0o(c29196OooO0OO);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str2 : setKeySet) {
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -2069802592:
                            if (str2.equals("isInSelectionMode")) {
                                OooO0OO(c29196OooO0OO);
                            }
                            break;
                        case -1992012396:
                            if (str2.equals("duration")) {
                                OooO0O0(c29196OooO0OO);
                            }
                            break;
                        case -1073342556:
                            if (str2.equals("isPlaying")) {
                                OooO0Oo(c29196OooO0OO);
                            }
                            break;
                        case 3373707:
                            if (str2.equals("name")) {
                                textView2.setText(str);
                            }
                            break;
                        case 860485767:
                            if (str2.equals("waveformData")) {
                                OooO0o(c29196OooO0OO);
                            }
                            break;
                        case 1191572123:
                            if (str2.equals("selected")) {
                                OooO0o0(c29196OooO0OO);
                            }
                            break;
                        case 1820416591:
                            if (str2.equals("createAt")) {
                                textView.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Long.valueOf(j)));
                            }
                            break;
                    }
                }
            }
        }

        public final void OooO0O0(C29196OooO0OO c29196OooO0OO) {
            long j = c29196OooO0OO.f103558OooO0OO / ((long) 1000);
            long j2 = 60;
            long j3 = j / j2;
            this.f103571OooO0O0.setText(String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / j2), Long.valueOf(j3 % j2), Long.valueOf(j % j2)}, 3)));
        }

        public final void OooO0OO(C29196OooO0OO c29196OooO0OO) {
            boolean z = c29196OooO0OO.f103562OooO0oO;
            this.f103573OooO0Oo.setVisibility(z ? 8 : 0);
            this.f103574OooO0o.setVisibility(z ? 0 : 8);
            this.f103575OooO0o0.setVisibility(z ? 0 : 8);
        }

        public final void OooO0Oo(C29196OooO0OO c29196OooO0OO) {
            ImageView imageView = this.f103573OooO0Oo;
            boolean z = c29196OooO0OO.f103561OooO0o0;
            imageView.setActivated(z);
            if (z) {
                imageView.setImageDrawable(new C29210OooO00o(ContextCompat.getColor(imageView.getContext(), R.color.notein_accent_blue)));
            } else {
                imageView.setImageResource(R.drawable.ic_ni_media_play_btn_selector);
            }
        }

        public final void OooO0o(C29196OooO0OO c29196OooO0OO) {
            List<Float> bars = c29196OooO0OO.f103563OooO0oo;
            List<Float> list = bars;
            if (list == null || list.isEmpty()) {
                return;
            }
            Drawable drawable = this.f103573OooO0Oo.getDrawable();
            C29210OooO00o c29210OooO00o = drawable instanceof C29210OooO00o ? (C29210OooO00o) drawable : null;
            if (c29210OooO00o != null) {
                OooOOO0.OooO0oO(bars, "bars");
                c29210OooO00o.f103594OooO0O0 = bars;
                c29210OooO00o.invalidateSelf();
            }
        }

        public final void OooO0o0(C29196OooO0OO c29196OooO0OO) {
            ImageView imageView = this.f103573OooO0Oo;
            boolean z = c29196OooO0OO.f103560OooO0o;
            imageView.setSelected(z);
            this.f103574OooO0o.setSelected(z);
            this.f103570OooO00o.setSelected(z);
            this.f103571OooO0O0.setSelected(z);
            this.f103572OooO0OO.setSelected(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29196OooO0OO c29196OooO0OOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c29196OooO0OOOooO0OO);
        holder.OooO00o(c29196OooO0OOOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_audio_file, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        C29196OooO0OO c29196OooO0OOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29196OooO0OOOooO0OO, "getItem(...)");
        holder.OooO00o(c29196OooO0OOOooO0OO, (Bundle) obj);
    }
}
