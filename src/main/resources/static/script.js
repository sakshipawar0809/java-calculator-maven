const button = document.getElementById('calculate');
button.addEventListener('click', async () => {
  const a = document.getElementById('first').value;
  const b = document.getElementById('second').value;
  const operation = document.getElementById('operation').value;
  const result = document.getElementById('result');
  const message = document.getElementById('message');
  if (a === '' || b === '') { result.textContent = '—'; message.textContent = 'Please enter both numbers.'; return; }
  try {
    const params = new URLSearchParams({a, b, operation});
    const response = await fetch(`/api/calculator/calculate?${params}`);
    const data = await response.json();
    if (!response.ok) throw new Error(data.message || 'Calculation failed');
    result.textContent = Number(data.result.toPrecision(12)).toString();
    message.textContent = 'Calculation completed successfully.';
  } catch (error) { result.textContent = 'Error'; message.textContent = error.message; }
});
