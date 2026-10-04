package o0o0OoOO;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.global.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import org.json.JSONException;

/* JADX INFO: renamed from: o0o0OoOO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30714Oooo00O extends AbstractC22050OooOo0o<C30713Oooo000, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final SimpleDateFormat f109840OooO0O0 = new SimpleDateFormat("yy/MM/dd", Locale.CHINA);

    /* JADX INFO: renamed from: o0o0OoOO.Oooo00O$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C30713Oooo000> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f109841OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C30713Oooo000 c30713Oooo000, C30713Oooo000 c30713Oooo0002) {
            return c30713Oooo000.equals(c30713Oooo0002);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C30713Oooo000 c30713Oooo000, C30713Oooo000 c30713Oooo0002) {
            return c30713Oooo000.equals(c30713Oooo0002);
        }
    }

    /* JADX INFO: renamed from: o0o0OoOO.Oooo00O$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f109842OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SimpleDraweeView f109843OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f109844OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f109842OooO00o = (TextView) view.findViewById(R.id.tv_note_title);
            this.f109843OooO0O0 = (SimpleDraweeView) view.findViewById(R.id.image);
            this.f109844OooO0OO = (TextView) view.findViewById(R.id.tv_image_creation_time);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return !OooO0OO(i).f109839OooO0o0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C30713Oooo000 c30713Oooo000OooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c30713Oooo000OooO0OO);
        if (c30713Oooo000OooO0OO.f109839OooO0o0) {
            TextView textView = holder.f109842OooO00o;
            if (textView != null) {
                textView.setText(c30713Oooo000OooO0OO.f109835OooO00o);
                return;
            }
            return;
        }
        TextView textView2 = holder.f109844OooO0OO;
        if (textView2 != null) {
            textView2.setText(f109840OooO0O0.format(Long.valueOf(c30713Oooo000OooO0OO.f109837OooO0OO)));
        }
        int color = c30713Oooo000OooO0OO.f109838OooO0Oo ? ContextCompat.getColor(holder.itemView.getContext(), R.color.item_text_name_color) : ContextCompat.getColor(holder.itemView.getContext(), R.color.warning_color);
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.fromFile(new File(c30713Oooo000OooO0OO.f109836OooO0O0)));
        c25764OooO0O0OooO0o.OooO0O0();
        c25764OooO0O0OooO0o.OooO0OO();
        C25763OooO00o c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
        SimpleDraweeView simpleDraweeView = holder.f109843OooO0O0;
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, i == 0 ? R.layout.item_debug_note_title : R.layout.item_debug_image, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0O0(viewOooO0O0);
    }
}
