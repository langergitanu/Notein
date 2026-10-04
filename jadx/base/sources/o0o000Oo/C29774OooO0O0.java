package o0o000Oo;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0o000OO.C29753OooO0oO;
import o0o000o0.C29775OooO00o;

/* JADX INFO: renamed from: o0o000Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29774OooO0O0 extends AbstractC22050OooOo0o<C29775OooO00o, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C29753OooO0oO f105666OooO0O0;

    /* JADX INFO: renamed from: o0o000Oo.OooO0O0$OooO00o */
    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f105667OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f105668OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final EditText f105669OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f105670OooO0Oo;

        public OooO00o(View view) {
            super(view);
            this.f105667OooO00o = (TextView) view.findViewById(R.id.tv_username);
            this.f105668OooO0O0 = (TextView) view.findViewById(R.id.tv_creation_time);
            this.f105669OooO0OO = (EditText) view.findViewById(R.id.et_content);
            this.f105670OooO0Oo = view.findViewById(R.id.v_divider);
        }

        public final void OooO00o(final C29775OooO00o c29775OooO00o, Bundle bundle) {
            this.itemView.setTag(c29775OooO00o);
            EditText editText = this.f105669OooO0OO;
            editText.setTag(c29775OooO00o);
            View view = this.itemView;
            final C29774OooO0O0 c29774OooO0O0 = C29774OooO0O0.this;
            view.setOnClickListener(new ViewOnClickListenerC29543o000O0o0(c29774OooO0O0, c29775OooO00o));
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o000Oo.OooO00o
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    C29775OooO00o c29775OooO00oOooO00o = C29775OooO00o.OooO00o(c29775OooO00o, this.f105669OooO0OO.getText().toString());
                    C29753OooO0oO c29753OooO0oO = c29774OooO0O0.f105666OooO0O0;
                    if (c29753OooO0oO != null) {
                        OooOOO0.OooO0Oo(view2);
                        EditText editText2 = (EditText) view2;
                        TextAnnoTextEditor textAnnoTextEditor = c29753OooO0oO.f105520OooO00o;
                        if (z) {
                            int i = TextAnnoTextEditor.f76394OoooO0O;
                            textAnnoTextEditor.getClass();
                            TextAnnoTextEditor.OooO00o oooO00o = new TextAnnoTextEditor.OooO00o(textAnnoTextEditor, editText2, c29775OooO00oOooO00o);
                            textAnnoTextEditor.f76414Oooo0oo = oooO00o;
                            editText2.addTextChangedListener(oooO00o.f76419OooO0OO);
                            textAnnoTextEditor.OooO0O0();
                            return;
                        }
                        int i2 = TextAnnoTextEditor.f76394OoooO0O;
                        textAnnoTextEditor.OooO0Oo();
                        TextAnnoTextEditor.OooO00o oooO00o2 = textAnnoTextEditor.f76414Oooo0oo;
                        if (oooO00o2 != null) {
                            oooO00o2.f76417OooO00o.removeTextChangedListener(oooO00o2.f76419OooO0OO);
                        }
                        textAnnoTextEditor.f76414Oooo0oo = null;
                        textAnnoTextEditor.OooO0OO();
                    }
                }
            });
            String str = c29775OooO00o.f105678OooO0o0;
            View divider = this.f105670OooO0Oo;
            TextView textView = this.f105667OooO00o;
            boolean z = c29775OooO00o.f105677OooO0o;
            String str2 = c29775OooO00o.f105674OooO0O0;
            TextView textView2 = this.f105668OooO0O0;
            String str3 = c29775OooO00o.f105676OooO0Oo;
            if (bundle == null || bundle.isEmpty()) {
                textView.setText(str2);
                textView2.setText(str);
                editText.setText(str3);
                OooOOO0.OooO0o(divider, "divider");
                divider.setVisibility(z ? 8 : 0);
                return;
            }
            if (bundle.containsKey("username")) {
                textView.setText(str2);
            }
            if (bundle.containsKey(C17625c.f52155b)) {
                textView2.setText(str);
            }
            if (bundle.containsKey("text")) {
                editText.setText(str3);
            }
            if (bundle.containsKey("isLast")) {
                OooOOO0.OooO0o(divider, "divider");
                divider.setVisibility(z ? 8 : 0);
            }
        }
    }

    /* JADX INFO: renamed from: o0o000Oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20022OooO0O0 extends OooOOO.AbstractC22036OooO0o0<C29775OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20022OooO0O0 f105672OooO00o = new C20022OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29775OooO00o c29775OooO00o, C29775OooO00o c29775OooO00o2) {
            return c29775OooO00o.equals(c29775OooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29775OooO00o c29775OooO00o, C29775OooO00o c29775OooO00o2) {
            C29775OooO00o c29775OooO00o3 = c29775OooO00o;
            C29775OooO00o c29775OooO00o4 = c29775OooO00o2;
            return OooOOO0.OooO0O0(c29775OooO00o3.f105673OooO00o, c29775OooO00o4.f105673OooO00o) && c29775OooO00o3.f105675OooO0OO == c29775OooO00o4.f105675OooO0OO;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C29775OooO00o c29775OooO00o, C29775OooO00o c29775OooO00o2) {
            C29775OooO00o c29775OooO00o3 = c29775OooO00o;
            C29775OooO00o c29775OooO00o4 = c29775OooO00o2;
            Bundle bundle = new Bundle();
            boolean z = c29775OooO00o3.f105677OooO0o;
            boolean z2 = c29775OooO00o4.f105677OooO0o;
            if (z != z2) {
                bundle.putBoolean("isLast", z2);
            }
            String str = c29775OooO00o3.f105674OooO0O0;
            String str2 = c29775OooO00o4.f105674OooO0O0;
            if (!OooOOO0.OooO0O0(str, str2)) {
                bundle.putString("username", str2);
            }
            String str3 = c29775OooO00o3.f105676OooO0Oo;
            String str4 = c29775OooO00o4.f105676OooO0Oo;
            if (!OooOOO0.OooO0O0(str3, str4)) {
                bundle.putString("text", str4);
            }
            String str5 = c29775OooO00o3.f105678OooO0o0;
            String str6 = c29775OooO00o4.f105678OooO0o0;
            if (!str5.equals(str6)) {
                bundle.putString(C17625c.f52155b, str6);
            }
            return bundle;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        C29775OooO00o c29775OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29775OooO00oOooO0OO, "getItem(...)");
        ((OooO00o) holder).OooO00o(c29775OooO00oOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_anno_default, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO00o(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i);
            return;
        }
        C29775OooO00o c29775OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29775OooO00oOooO0OO, "getItem(...)");
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        ((OooO00o) holder).OooO00o(c29775OooO00oOooO0OO, (Bundle) obj);
    }
}
