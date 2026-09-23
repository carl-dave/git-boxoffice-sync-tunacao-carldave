function isValidQuantity(quantity) {
  return quantity > 0 && quantity <= 20;
}

function calculateTicketPrice(quantity, basePrice, seating) {
  let price = Math.round(quantity * basePrice);

  if (quantity >= 5) {
    price = price * 0.90;
  }

  if (seating === "premium") {
    price = price * 1.50;
  }

  return price;
}

module.exports = { isValidQuantity, calculateTicketPrice };
