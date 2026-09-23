function isValidQuantity(quantity) {
  return quantity > 0 && quantity <= 20;
}

function calculateTicketPrice(quantity, basePrice, seating) {
  let price = Math.floor(quantity * basePrice);

  if (seating === "premium") {
    price = price * 1.50;
  }

  return price;
}

module.exports = { isValidQuantity, calculateTicketPrice };