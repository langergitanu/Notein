package o0OOOOO0;

import com.orion.notein.data.service.dto.transactions.TransactionsProductDto;
import com.orion.notein.data.service.responsebody.transactions.PurchaseHintsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oOO00oOo.InterfaceC34391OooO0o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H§@¢\u0006\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m80612d2 = {"Lo0OOOOO0/OooOO0O;", "", "LooooOOo0/OooOoO;", "", "Lcom/orion/notein/data/service/dto/transactions/TransactionsProductDto;", "OooO00o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/service/responsebody/transactions/PurchaseHintsResponse;", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface OooOO0O {
    @InterfaceC34391OooO0o("/commodity/list2")
    Object OooO00o(Continuation<? super C35238OooOoO<List<TransactionsProductDto>>> continuation);

    @InterfaceC34391OooO0o("/api/purchase/hints")
    Object OooO0O0(Continuation<? super C35238OooOoO<PurchaseHintsResponse>> continuation);
}
