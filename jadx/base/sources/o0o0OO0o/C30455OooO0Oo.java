package o0o0OO0o;

import Oooo0.o000000O;
import Oooo0o0.C21009OooOooO;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28139OooO0o;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0o0OO0O.ViewOnLongClickListenerC30448OooOoo0;
import oOO00oo.C34406OooO00o;
import org.json.JSONException;

/* JADX INFO: renamed from: o0o0OO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30455OooO0Oo extends AbstractC22050OooOo0o<TiledPagePreviewVO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f108750OooO0o0 = o000000O.OooO0o(93);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f108751OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ViewOnClickListenerC28413OooO0oO f108752OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ViewOnLongClickListenerC30448OooOoo0 f108753OooO0Oo;

    /* JADX INFO: renamed from: o0o0OO0o.OooO0Oo$OooO00o */
    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f108754OooO00o;

        public OooO00o(C30455OooO0Oo c30455OooO0Oo, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.btn_add_page);
            this.f108754OooO00o = viewFindViewById;
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC28139OooO0o(c30455OooO0Oo, 4));
        }
    }

    /* JADX INFO: renamed from: o0o0OO0o.OooO0Oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDraweeView f108755OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f108756OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f108757OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ViewGroup f108758OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f108759OooO0o0;

        public OooO0O0(final C30455OooO0Oo c30455OooO0Oo, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.f57988tn);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
            this.f108755OooO00o = simpleDraweeView;
            this.f108756OooO0O0 = (TextView) view.findViewById(R.id.page_number);
            this.f108757OooO0OO = (ImageView) view.findViewById(R.id.selected);
            this.f108758OooO0Oo = (ViewGroup) view.findViewById(R.id.cl_draggable_view);
            this.f108759OooO0o0 = view.findViewById(R.id.dragging_mask);
            view.setOnClickListener(new ViewOnClickListenerC28141OooO0oO(c30455OooO0Oo, 4));
            simpleDraweeView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o0OO0o.OooO0o0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    ViewOnLongClickListenerC30448OooOoo0 viewOnLongClickListenerC30448OooOoo0 = c30455OooO0Oo.f108753OooO0Oo;
                    if (viewOnLongClickListenerC30448OooOoo0 != null) {
                        return viewOnLongClickListenerC30448OooOoo0.onLongClick(view2);
                    }
                    return false;
                }
            });
            simpleDraweeView.setOnClickListener(new ViewOnClickListenerC28142OooO0oo(c30455OooO0Oo, 4));
        }

        public static void OooO0o0(TiledPagePreviewVO tiledPagePreviewVO, SimpleDraweeView simpleDraweeView) {
            C25763OooO00o c25763OooO00oOooO00o;
            String url = tiledPagePreviewVO.getUrl();
            if (url.length() <= 0) {
                url = null;
            }
            Uri uriFromFile = url != null ? Uri.fromFile(new File(url)) : null;
            if (uriFromFile != null) {
                C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(uriFromFile);
                c25764OooO0O0OooO0o.OooO0O0();
                c25764OooO0O0OooO0o.OooO0OO();
                c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
            } else {
                C25764OooO0O0 c25764OooO0O0OooO0o0 = C25764OooO0O0.OooO0o0(R.color.white);
                c25764OooO0O0OooO0o0.OooO0O0();
                c25764OooO0O0OooO0o0.OooO0OO();
                c25763OooO00oOooO00o = c25764OooO0O0OooO0o0.OooO00o();
            }
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            layoutParams.width = Math.max(C30455OooO0Oo.f108750OooO0o0, tiledPagePreviewVO.getWidth());
            layoutParams.height = tiledPagePreviewVO.getHeight();
            simpleDraweeView.requestLayout();
            simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
        }

        public final void OooO00o(TiledPagePreviewVO tiledPagePreviewVO, boolean z) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            int index = tiledPagePreviewVO.getIndex();
            String url = tiledPagePreviewVO.getUrl();
            int width = tiledPagePreviewVO.getWidth();
            int height = tiledPagePreviewVO.getHeight();
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(index, "bind page ", ", url : ", url, ", (w,h) : ");
            C24472OooOoo.OooO0O0(sbOooO0OO, ", ", ", needRefresh: ", width, height);
            sbOooO0OO.append(z);
            c20358OooO00o.OooO00o(sbOooO0OO.toString(), new Object[0]);
            SimpleDraweeView simpleDraweeView = this.f108755OooO00o;
            simpleDraweeView.setTag(tiledPagePreviewVO);
            this.itemView.setTag(tiledPagePreviewVO);
            OooO0O0();
            OooO0OO();
            if (z) {
                OooO0o0(tiledPagePreviewVO, simpleDraweeView);
            }
            boolean selectable = tiledPagePreviewVO.getSelectable();
            ImageView imageView = this.f108757OooO0OO;
            if (selectable) {
                imageView.setVisibility(0);
                imageView.setSelected(tiledPagePreviewVO.isSelected());
            } else {
                imageView.setVisibility(8);
            }
            this.f108756OooO0O0.setText(String.valueOf(tiledPagePreviewVO.getIndex() + 1));
            if (!tiledPagePreviewVO.getHighlight()) {
                this.itemView.setBackground(null);
            } else {
                View view = this.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_color_pressed));
            }
        }

        public final void OooO0O0() {
            this.itemView.setTranslationZ(0.0f);
            View view = this.f108759OooO0o0;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        public final void OooO0OO() {
            ViewGroup viewGroup = this.f108758OooO0Oo;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                viewGroup.setTranslationX(0.0f);
                viewGroup.setTranslationY(0.0f);
            }
        }

        public final void OooO0Oo(int i, boolean z) {
            ViewGroup viewGroup = this.f108758OooO0Oo;
            if (viewGroup == null || viewGroup.getVisibility() == 0) {
                return;
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewGroup.findViewById(R.id.dragging_cover);
            if (simpleDraweeView != null) {
                Object tag = this.itemView.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
                OooO0o0((TiledPagePreviewVO) tag, simpleDraweeView);
            }
            View viewFindViewById = viewGroup.findViewById(R.id.dragging_decor_1);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(z ? 0 : 8);
            }
            View viewFindViewById2 = viewGroup.findViewById(R.id.dragging_decor_2);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility((!z || i <= 2) ? 8 : 0);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.dragging_num_tips);
            if (textView != null) {
                textView.setVisibility(z ? 0 : 8);
                textView.setText(String.valueOf(i));
            }
            viewGroup.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o0o0OO0o.OooO0Oo$OooO0OO */
    public static final class OooO0OO extends OooOOO.AbstractC22036OooO0o0<TiledPagePreviewVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f108760OooO00o = new OooO0OO();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            return tiledPagePreviewVO.equals(tiledPagePreviewVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            TiledPagePreviewVO tiledPagePreviewVO3 = tiledPagePreviewVO;
            TiledPagePreviewVO tiledPagePreviewVO4 = tiledPagePreviewVO2;
            return OooOOO0.OooO0O0(tiledPagePreviewVO3.getId(), tiledPagePreviewVO4.getId()) && tiledPagePreviewVO3.getOrientation() == tiledPagePreviewVO4.getOrientation();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            TiledPagePreviewVO tiledPagePreviewVO3 = tiledPagePreviewVO;
            TiledPagePreviewVO tiledPagePreviewVO4 = tiledPagePreviewVO2;
            if (OooOOO0.OooO0O0(tiledPagePreviewVO3.getId(), tiledPagePreviewVO4.getId()) && tiledPagePreviewVO3.getIndex() == tiledPagePreviewVO4.getIndex()) {
                return (OooOOO0.OooO0O0(tiledPagePreviewVO3.getUrl(), tiledPagePreviewVO4.getUrl()) && tiledPagePreviewVO3.getTimestamp() == tiledPagePreviewVO4.getTimestamp()) ? tiledPagePreviewVO3.getSelectable() != tiledPagePreviewVO4.getSelectable() ? C22205OooOOo.OooO0O0("needRefresh", false) : C22205OooOOo.OooO0O0("needRefresh", false) : C22205OooOOo.OooO0O0("needRefresh", true);
            }
            return C22205OooOOo.OooO0O0("needRefresh", true);
        }
    }

    public C30455OooO0Oo(boolean z) {
        super(OooO0OO.f108760OooO00o);
        this.f108751OooO0O0 = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC22050OooOo0o, androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return super.getItemCount() + (this.f108751OooO0O0 ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return (this.f108751OooO0O0 && i == getItemCount() - 1) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        if (this.f108751OooO0O0 && i == getItemCount() - 1) {
            return;
        }
        TiledPagePreviewVO tiledPagePreviewVOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(tiledPagePreviewVOOooO0OO, "getItem(...)");
        ((OooO0O0) holder).OooO00o(tiledPagePreviewVOOooO0OO, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        OooOOO0.OooO0oO(parent, "parent");
        if (i != 1) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_page_tile_tn, parent, false);
            OooOOO0.OooO0Oo(viewOooO0O0);
            return new OooO0O0(this, viewOooO0O0);
        }
        View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_page_tile_add_page, parent, false);
        OooOOO0.OooO0Oo(viewOooO0O02);
        return new OooO00o(this, viewOooO0O02);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty() && (!this.f108751OooO0O0 || i != getItemCount() - 1)) {
            Object obj = payloads.get(0);
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            if (!((Bundle) obj).getBoolean("needRefresh")) {
                TiledPagePreviewVO tiledPagePreviewVOOooO0OO = OooO0OO(i);
                OooOOO0.OooO0o(tiledPagePreviewVOOooO0OO, "getItem(...)");
                ((OooO0O0) holder).OooO00o(tiledPagePreviewVOOooO0OO, false);
                return;
            }
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
