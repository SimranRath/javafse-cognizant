package exercise4;

	public class StripeAdapter implements PaymentProcessor {
	    private StripeGateway stripeGateway;

	    public StripeAdapter(StripeGateway stripeGateway) {
	        this.stripeGateway = stripeGateway;
	    }

	    @Override
	    public void processPayment(String paymentMethod, double amount) {
	        stripeGateway.chargeCard(paymentMethod, amount);
	    }
	}