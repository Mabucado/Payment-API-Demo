<!DOCTYPE html>
<html>
<head>
    <title>Payment Page</title>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>

<h2>Make Payment</h2>

<button id="payBtn">Pay Now</button>
<div id="result"></div>

<script>
    $("#payBtn").click(function () {
        $.ajax({
            url: "/api/payments",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                amount: 500,
                currency: "ZAR"
            }),
            success: function (data) {
                $("#result").html("Status: " + data.status);
                $("#result").html("Status: " + data.message);
            },
            error: function () {
                $("#result").html("Payment failed");
            }
        });
    });
</script>

</body>
</html>
