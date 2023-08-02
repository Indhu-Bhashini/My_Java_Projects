public class Pizza {
        private int price;
        
	    private Boolean veg;
	    private int extraCheesePrice=100;
	    private int extraToppingsPrice=150;
	    private int pack=25;
	    private int baseprice;
	    private boolean isExtraCheeseAdded=false;
	    private boolean isExtraToppingsAdded=false;
	    private boolean isTakeAwayOpted=false;
	    public Pizza(Boolean veg) {
	    	this.veg=veg;
	    	if(this.veg) {
	    		this.price=300;
	    	}
	    	else {
	    		this.price=400;
	    	}
	    	baseprice=this.price;
	    }
	    public void addExtraCheese() {
	    	isExtraCheeseAdded=true;
	    	this.price+=extraCheesePrice;
	    }
	    public void addExtraToppings() {
	    	isExtraToppingsAdded=true;
	    	this.price+=extraToppingsPrice;
	    }
	    public void takeAway() {
	    	isTakeAwayOpted=true;
	    	this.price+=pack;
	    }
	    public void getBill() {
	    	String bill="";
	    	System.out.println("Pizza: "+baseprice);
	    	if(isExtraCheeseAdded) {
	    		bill+="Extra cheese added: "+extraCheesePrice+"\n";
	    	}
	    	if(isExtraToppingsAdded) {
	    		bill+="Extra toppings added: "+extraToppingsPrice+"\n";
	    	}
	    	if(isTakeAwayOpted) {
	    		bill+="Take Away: "+pack+"\n";
	    	}
	    	bill+="Bill: "+this.price+"\n";
	    	System.out.println(bill);
	    }

}
